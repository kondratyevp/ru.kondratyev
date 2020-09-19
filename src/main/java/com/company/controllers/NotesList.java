package com.company.controllers;

import com.company.models.Note;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@Controller
public class NotesList {

    private static List<Note> notes = new ArrayList<>();
    private static List<Note> allnotes = new ArrayList<>();
    private static int id = 0;

    @GetMapping("/")
    public String index(@RequestParam(name = "q", required = false) String q,
                        Model model) {
        model.addAttribute("pageTitle", "Hello, World");
        notes = allnotes;
        if (q != null && q.length() > 0) {
            notes = new ArrayList<>();
            for (Note note : allnotes) {
                boolean r = false;
                if (note.getTitle() != null && note.getTitle().length() > 0) {
                    r = Pattern.compile(Pattern.quote(q), Pattern.CASE_INSENSITIVE).matcher(note.getTitle()).find();
                }
                if (!r && note.getText() != null && note.getText().length() > 0) {
                    r = Pattern.compile(Pattern.quote(q), Pattern.CASE_INSENSITIVE).matcher(note.getText()).find();
                }
                if (r) {
                    notes.add(note);
                }
            }
        } else {
            q = "";
        }
        model.addAttribute("notes", notes);
        model.addAttribute("q", q);
        return "index";
    }

    @PostMapping("/delete")
    public String delete(@RequestParam(name = "fordelete", required = false) String fordelete,
                         Model model, RedirectAttributes attr) {
        System.out.println(fordelete);
        if (fordelete != null) {
            int i = Integer.valueOf(fordelete);
            Iterator<Note> it = allnotes.iterator();
            while (it.hasNext()) {
                Note tmp = it.next();
                if (tmp.getId() == i) {
                    it.remove();
                }
            }
        }
        return "redirect:/";
    }


        @PostMapping("/appendnew")
        public String appendnew ( @RequestParam(name = "title", required = false) String title,
                @RequestParam(name = "text", required = false) String text,
                @RequestParam(name = "fordelete", required = false) List < String > fordelete,
                Model model, RedirectAttributes attr){

            if (title.length() == 0 && text.length() == 0) {
                attr.addFlashAttribute("emptymessage", "Введите текст либо заголовок заметки");
                return "redirect:/";
            }
            allnotes.add(new Note(title, text, id++));
            return "redirect:/";
        }
    }

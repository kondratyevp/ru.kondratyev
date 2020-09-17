package com.company.controllers;

import com.company.models.Note;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NotesList {

    private static List<Note> notes = new ArrayList<>();

        @GetMapping("/")
        public String index (Model model) {
            model.addAttribute("pageTitle", "Hello, World");
            model.addAttribute("notes", notes);
            return "index";
        }

    @PostMapping("/appendnew")
    public String appendnew (@RequestParam(name="title", required=false) String title,
                             @RequestParam(name="text", required=false) String text,
                             Model model) {
       notes.add(new Note(title, text));
        return "redirect:/";
    }
    }

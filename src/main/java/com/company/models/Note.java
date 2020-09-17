package com.company.models;

public class Note {
    private String title;
    private String text;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (title != null ? !title.equals(note.title) : note.title != null) return false;
        return text != null ? text.equals(note.text) : note.text == null;
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + ( text != null ? text.hashCode() : 0 );
        return result;
    }
}

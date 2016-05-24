package com.maciej.geonote.note;

/**
 * Created by Maciej on 20.05.2016.
 */
public class Note {
    private String title;
    private String data;

    public Note(String title, String data) {
        this.title = title;
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

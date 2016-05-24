package com.maciej.geonote.viewmodel;

/**
 * Created by Maciej on 20.05.2016.
 */
public class NoteViewModel {
    public TextViewModel firstText;
    public TextViewModel secondTest;

    public NoteViewModel(String title, String subject) {
        firstText.setText(title);
        secondTest.setText(subject);
    }
}

package com.maciej.geonote.viewmodel.fragmentviewmodel;

import com.maciej.geonote.note.Note;
import com.maciej.geonote.viewmodel.ButtonViewModel;

import java.util.ArrayList;

/**
 * Created by Maciej on 20.05.2016.
 */
public class MainFragmentViewModel {
    public ArrayList<Note> notes = new ArrayList<>();
    public ButtonViewModel fab = new ButtonViewModel();
}

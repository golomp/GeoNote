package com.maciej.geonote.viewmodel.activityviewmodel;

import com.maciej.geonote.viewmodel.TextViewModel;

/**
 * Created by Maciej on 19.05.2016.
 */
public class MainActivityViewModel {
    public TextViewModel helloText;

    public MainActivityViewModel() {
        helloText = new TextViewModel("no elo");
    }
}

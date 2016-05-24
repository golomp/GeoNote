package com.maciej.geonote.viewmodel;

import android.databinding.Bindable;

import com.maciej.geonote.BR;

/**
 * Created by Maciej on 19.05.2016.
 */
public class TextViewModel extends BaseViewModel{

    @Bindable
    public String text;

    public void setText(String text){
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    public TextViewModel(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }
}

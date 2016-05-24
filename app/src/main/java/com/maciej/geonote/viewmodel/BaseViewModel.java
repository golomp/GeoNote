package com.maciej.geonote.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.maciej.geonote.BR;


/**
 * Created by Maciej on 19.05.2016.
 */
public class BaseViewModel extends BaseObservable {

    @Bindable
    public int visibility;

    public void setVisibility(int visible){
        visibility = visible;
        notifyPropertyChanged(BR.visibility);
    }
}

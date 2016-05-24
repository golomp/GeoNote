package com.maciej.geonote.viewmodel;

import android.view.View;

import rx.Observable;
import rx.subjects.PublishSubject;

/**
 * Created by Maciej on 20.05.2016.
 */
public class ButtonViewModel extends BaseViewModel {

    private PublishSubject<Object> buttonObservable = PublishSubject.create();

    public Observable<Object> rxTap() {
        return buttonObservable.asObservable();
    }

    public void onButtonClick(View view) {
        buttonObservable.onNext(null);
    }
}

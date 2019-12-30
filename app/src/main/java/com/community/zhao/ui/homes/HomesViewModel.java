package com.community.zhao.ui.homes;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomesViewModel() {
        mText = new MutableLiveData<> ();
        mText.setValue ("");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
package com.hasanbilgin.tabbedjavafragment.ui.main;

import android.util.Log;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {

    private MutableLiveData<String> nameInput = new MutableLiveData<>();

    public void setName(String name) {
        nameInput.setValue(name);
        Log.i("logtestviewmodelgetvalue",nameInput.getValue());

    }

    public LiveData<String> getName() {
        return nameInput;
    }
}
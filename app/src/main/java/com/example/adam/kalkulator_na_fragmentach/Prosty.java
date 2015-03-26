package com.example.adam.kalkulator_na_fragmentach;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**

 */
public class Prosty extends Fragment {
    View mainView;



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_prosty, container, false);
        initialize();

        return mainView;
    }

    private void initialize() {
    }
}

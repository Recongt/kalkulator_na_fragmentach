package com.example.adam.kalkulator_na_fragmentach;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Naukowy extends Fragment implements View.OnClickListener {

    View mainView;
     Button one, two, three, four, five, six, seven, eight, nine, zero, C, isequal, plus, minus, mnozenie, dzielenie;
     TextView wynik;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_naukowy, container, false);
        initialize();
        listeners();

        return mainView;

    }



    private void initialize() {

        one = (Button) mainView.findViewById(R.id.button1);
        two = (Button) mainView.findViewById(R.id.button2);
        three = (Button) mainView.findViewById(R.id.button3);
        four = (Button) mainView.findViewById(R.id.button4);
        five = (Button) mainView.findViewById(R.id.button5);
        six = (Button) mainView.findViewById(R.id.button6);
        seven = (Button) mainView.findViewById(R.id.button7);
        eight = (Button) mainView.findViewById(R.id.button8);
        nine = (Button) mainView.findViewById(R.id.button9);
        zero = (Button) mainView.findViewById(R.id.button0);
        C = (Button) mainView.findViewById(R.id.C);
        isequal = (Button) mainView.findViewById(R.id.isequal);
        plus = (Button) mainView.findViewById(R.id.plus);
        minus = (Button) mainView.findViewById(R.id.minus);
        mnozenie = (Button) mainView.findViewById(R.id.mnozenie);
        dzielenie = (Button) mainView.findViewById(R.id.dzielenie);




        wynik = (TextView) mainView.findViewById(R.id.textView);

    }

    private void listeners() {

        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);

        C.setOnClickListener(this);
        isequal.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mnozenie.setOnClickListener(this);
        dzielenie.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}


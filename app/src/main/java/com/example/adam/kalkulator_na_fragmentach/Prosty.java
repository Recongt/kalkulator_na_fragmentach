package com.example.adam.kalkulator_na_fragmentach;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Prosty extends Fragment implements View.OnClickListener {
    View mainView;
    int operacja = 0;
    boolean czy_jest_juz_pierwsza = false;
    boolean czy_jest_juz_operator = false;
    /*
    Brak = 0
    Dodawanie = 1
    odejmowanie = 2
    mnozenie = 3
    dzielenie =4
    */
    double pierwsza_liczba = 0;
    double druga_liczba = 0;
    String temp = "0";
    double wynik = 0;
    String display_text = "";
    private Button one, two, three, four, five, six, seven, eight, nine, zero, C, isequal, plus, minus, mnozenie, dzielenie;
    private TextView wyswietlacz;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_prosty, container, false);
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


        wyswietlacz = (TextView) mainView.findViewById(R.id.textView);

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

        if (v == C) {
            C_wywolanie();

        } else if (v == isequal) {
            is_equal_wywolanie();
        } else if (v == plus) {
            plus_wywolanie();
        } else if (v == minus) {
            minus_wywolanie();
        } else if (v == dzielenie) {
            dzielenie_wywolanie();
        } else if (v == mnozenie) {
            mnozenie_wywolanie();
        } else if (v == zero) {
            zero_wywolanie();
        } else if (v == one) {
            one_wywolanie();
        } else if (v == two) {
            two_wywolanie();
        } else if (v == three) {
            three_wywolanie();
        } else if (v == four) {
            four_wywolanie();
        } else if (v == five) {
            five_wywolanie();
        } else if (v == six) {
            six_wywolanie();
        } else if (v == seven) {
            seven_wywolanie();
        } else if (v == eight) {
            eight_wywolanie();
        } else if (v == nine) {
            nine_wywolanie();
        }

    }

    private void nine_wywolanie() {

        MathEval mathEval = new MathEval();
        double result = mathEval.evaluate("sin(0.8)*2^8/1.22");
        wyswietlacz.setText(Double.toString(result));


            /*
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "9";
        display_text += "9";
        wyswietlacz.setText(display_text);*/

    }

    private void eight_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "8";
        display_text += "8";
        wyswietlacz.setText(display_text);

    }

    private void seven_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "7";
        display_text += "7";
        wyswietlacz.setText(display_text);

    }

    private void six_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "6";
        display_text += "6";
        wyswietlacz.setText(display_text);

    }

    private void five_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "5";
        display_text += "5";
        wyswietlacz.setText(display_text);

    }

    private void four_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "4";
        display_text += "4";
        wyswietlacz.setText(display_text);

    }

    private void three_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "3";
        display_text += "3";
        wyswietlacz.setText(display_text);

    }

    private void two_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "2";
        display_text += "2";
        wyswietlacz.setText(display_text);

    }

    private void one_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "1";
        display_text += "1";
        wyswietlacz.setText(display_text);

    }

    private void zero_wywolanie() {
        if (czy_jest_juz_pierwsza == false) {
            czy_jest_juz_pierwsza = true;
            temp = "";
            display_text = "";
        }

        temp += "0";
        display_text += "0";
        wyswietlacz.setText(display_text);

    }

    private void mnozenie_wywolanie() {
        dzialanie(3, "x");

    }

    private void dzielenie_wywolanie() {
        dzialanie(4, "/");

    }


    private void minus_wywolanie() {
        dzialanie(2, "-");
    }

    private void plus_wywolanie() {
        dzialanie(1, "+");
    }

    private void is_equal_wywolanie() {
        if (temp.isEmpty()) {

        } else {
            if (czy_jest_juz_pierwsza == true && czy_jest_juz_operator == true) {
                druga_liczba = Double.parseDouble(temp);
                wynik = operuj(operacja);
                wyswietlacz.setText(Double.toString(wynik));
                czy_jest_juz_operator = false;
                display_text = Double.toString(wynik);
                temp = Double.toString(wynik);
                pierwsza_liczba = wynik;


            } else if (czy_jest_juz_pierwsza == true && czy_jest_juz_operator == false) {
                wyswietlacz.setText(temp);
                display_text = temp;


            } else if (czy_jest_juz_pierwsza == false && czy_jest_juz_operator == false) {
                C_wywolanie();

            } else if (czy_jest_juz_pierwsza == false && czy_jest_juz_operator == true) {

            }
        }
    }

    private void C_wywolanie() {
        czy_jest_juz_pierwsza = false;
        czy_jest_juz_operator = false;
        pierwsza_liczba = 0;
        druga_liczba = 0;
        wynik = 0;
        wyswietlacz.setText("0");
        display_text = "";
        temp = "";

    }

    private double operuj(int operacja) {
        if (operacja == 1) {
            wynik = pierwsza_liczba + druga_liczba;
        } else if (operacja == 2) {
            wynik = pierwsza_liczba - druga_liczba;
        } else if (operacja == 3) {
            wynik = pierwsza_liczba * druga_liczba;
        } else if (operacja == 4) {
            wynik = pierwsza_liczba / druga_liczba;
        } else if (operacja == 0) {
            Toast.makeText(getActivity(), "Błąd wewnętrzny",
                    Toast.LENGTH_LONG).show();
        }
        return wynik;
    }

    public void toast_wypisz(String tekst) {
        Toast.makeText(getActivity(), tekst,
                Toast.LENGTH_LONG).show();
    }


    public void dzialanie(int dzialanie, String znak) {


        if (czy_jest_juz_pierwsza == true && czy_jest_juz_operator == true) {
            if (temp.isEmpty()) {

            } else {
                // np 3*3* ma zamienic w 9*
                druga_liczba = Double.parseDouble(temp);
                temp = "";
                wynik = operuj(dzialanie);
                czy_jest_juz_operator = true;
                czy_jest_juz_pierwsza = true;
                display_text = Double.toString(wynik) + znak;
                pierwsza_liczba = wynik;
                druga_liczba = 0;
                wyswietlacz.setText(display_text);

            }

        } else if (czy_jest_juz_pierwsza == true && czy_jest_juz_operator == false) {
            operacja = dzialanie;
            pierwsza_liczba = Double.parseDouble(temp);
            temp = "";
            display_text += znak;
            czy_jest_juz_operator = true;
            wyswietlacz.setText(display_text);


        } else if (czy_jest_juz_pierwsza == false && czy_jest_juz_operator == true) {
            // lul niemozliwe


        } else if (czy_jest_juz_pierwsza == false && czy_jest_juz_operator == false) {
            Toast.makeText(getActivity(), "Wprowadz pierwsza liczbe",
                    Toast.LENGTH_LONG).show();
        }
    }

}



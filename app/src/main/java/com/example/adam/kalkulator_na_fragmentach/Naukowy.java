package com.example.adam.kalkulator_na_fragmentach;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatException;

// ToDO dodac kropke, poprawic potege(ogolnie jednooperatorowe) dzialanie 2+2*2 - sprawdzic czego nie kasuje podmiana fragmentow w menu


public class Naukowy extends Fragment implements View.OnClickListener {
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
    ln(x) =5
    wyskladnik = 6
    sinx = 7
    cosx = 8
    tanx =9
    square = 10
    */
    double pierwsza_liczba = 0;
    double druga_liczba = 0;
    String temp = "0";
    double wynik = 0;
    String display_text = "";
    private Button one, two, three, four, five, six, seven, eight, nine, zero, C, isequal, plus, minus,
            mnozenie, dzielenie, Bksp, ln, sqrt, wykladnik, sinx, cosx, tanx, square, Leftbracket, RightBracket, dot;
    private TextView wyswietlacz;

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
        Bksp = (Button) mainView.findViewById(R.id.bksp);
        ln = (Button) mainView.findViewById(R.id.ln);
        sqrt = (Button) mainView.findViewById(R.id.sqrt);
        wykladnik = (Button) mainView.findViewById(R.id.wykladnik);
        sinx = (Button) mainView.findViewById(R.id.sin);
        cosx = (Button) mainView.findViewById(R.id.cosx);
        tanx = (Button) mainView.findViewById(R.id.tan);
        square = (Button) mainView.findViewById(R.id.square);
        wyswietlacz = (TextView) mainView.findViewById(R.id.textView);
        dot = (Button) mainView.findViewById(R.id.buttondot);
        Leftbracket = (Button) mainView.findViewById(R.id.buttonLeftBracket);
        RightBracket = (Button) mainView.findViewById(R.id.buttonRightBracket);

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
        Bksp.setOnClickListener(this);
        ln.setOnClickListener(this);
        sqrt.setOnClickListener(this);
        wykladnik.setOnClickListener(this);
        sinx.setOnClickListener(this);
        cosx.setOnClickListener(this);
        tanx.setOnClickListener(this);
        square.setOnClickListener(this);
        dot.setOnClickListener(this);
        Leftbracket.setOnClickListener(this);
        RightBracket.setOnClickListener(this);


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
        } else if (v == ln) {
            ln_wywolanie();
        } else if (v == sqrt) {
            sqrt_wywolanie();
        } else if (v == wykladnik) {
            wykladnik_wywolanie();
        } else if (v == sinx) {
            sinx_wywolanie();
        } else if (v == cosx) {
            cosx_wywolanie();
        } else if (v == tanx) {
            tanx_wywolanie();
        } else if (v == square) {
            square_wywolanie();
        } else if (v == Bksp) {
            Bksp_wywolanie();
        } else if (v == dot) {
            dot_wywolanie();
        } else if (v == Leftbracket) {
            LeftBracket_wywolanie();
        } else if (v == RightBracket) {
            RightBracket_wywolanie();
        }

    }


    private void RightBracket_wywolanie() {
        display_text += ")";
        wyswietlacz.setText(display_text);
    }

    private void LeftBracket_wywolanie() {
        display_text += "(";
        wyswietlacz.setText(display_text);
    }

    private void dot_wywolanie() {
        display_text += ".";
        wyswietlacz.setText(display_text);
    }


    private void Bksp_wywolanie() {
        if (czy_jest_juz_pierwsza && czy_jest_juz_operator) {
            if (temp.isEmpty()) {
                operacja = 0;
                display_text = display_text.substring(0, (display_text.length() - 1));
                temp = Double.toString(pierwsza_liczba);
                czy_jest_juz_operator = false;
                wyswietlacz.setText(display_text);


                /*
                operacja = 0;
                display_text = display_text.substring(0, (display_text.length() - 1));
                wyswietlacz.setText(display_text);
                czy_jest_juz_operator = false;
                temp = Double.toString(pierwsza_liczba);
                czy_jest_juz_pierwsza = false;*/
            } else {
                temp = temp.substring(0, (temp.length() - 1));
                display_text = display_text.substring(0, (display_text.length() - 1));
                wyswietlacz.setText(display_text);

            }

        } else if (czy_jest_juz_pierwsza && !czy_jest_juz_operator) {
            if (temp.isEmpty()) {
                //nic nie rob
            } else {
                temp = temp.substring(0, (temp.length() - 1));
                display_text = display_text.substring(0, (display_text.length() - 1));
                wyswietlacz.setText(display_text);
            }

        } else if (!czy_jest_juz_pierwsza && czy_jest_juz_operator) {
            //niedozowolone


        } else if (!czy_jest_juz_pierwsza && !czy_jest_juz_operator) {
            //nic nie rob

        }
    }

    private void square_wywolanie() {
        display_text += "sqrt(";
        wyswietlacz.setText(display_text);

        //jednooperatorowe_dzialanie(11);
    }

    private void tanx_wywolanie() {
        display_text += "tan(";
        wyswietlacz.setText(display_text);
        // jednooperatorowe_dzialanie(10);
    }

    private void cosx_wywolanie() {
        display_text += "cos(";
        wyswietlacz.setText(display_text);
        jednooperatorowe_dzialanie(9);
    }

    private void sinx_wywolanie() {

        display_text += "sin(";
        wyswietlacz.setText(display_text);
        //jednooperatorowe_dzialanie(8);
    }


    private void wykladnik_wywolanie() {
        display_text += "^";
        wyswietlacz.setText(display_text);
        //dzialanie(7, "^");
    }

    private void sqrt_wywolanie() {
        display_text += "sqrt(";
        wyswietlacz.setText(display_text);
        //jednooperatorowe_dzialanie(6);

    }

    private void ln_wywolanie() {

        try {
            double temp = Double.parseDouble(display_text);

        }catch (IllegalFormatConversionException e){
            e.printStackTrace();
        }


    }


    private void plus_wywolanie() {
        display_text += "+";
        wyswietlacz.setText(display_text);
    }

    private void minus_wywolanie() {
        display_text += "-";
        wyswietlacz.setText(display_text);
    }

    private void nine_wywolanie() {
        display_text += "9";
        wyswietlacz.setText(display_text);


    }

    private void eight_wywolanie() {
        display_text += "8";
        wyswietlacz.setText(display_text);
    }

    private void seven_wywolanie() {
        display_text += "7";
        wyswietlacz.setText(display_text);

    }

    private void six_wywolanie() {
        display_text += "6";
        wyswietlacz.setText(display_text);

    }

    private void five_wywolanie() {
        display_text += "5";
        wyswietlacz.setText(display_text);

    }

    private void four_wywolanie() {

        display_text += "4";
        wyswietlacz.setText(display_text);
    }

    private void three_wywolanie() {

        display_text += "3";
        wyswietlacz.setText(display_text);
    }

    private void two_wywolanie() {
        display_text += "2";
        wyswietlacz.setText(display_text);

    }

    private void one_wywolanie() {
        display_text += "1";
        wyswietlacz.setText(display_text);

    }

    private void zero_wywolanie() {
        display_text += "0";
        wyswietlacz.setText(display_text);

    }

    private void mnozenie_wywolanie() {
        display_text += "*";
        wyswietlacz.setText(display_text);

    }

    private void dzielenie_wywolanie() {
        display_text += "/";
        wyswietlacz.setText(display_text);
    }

    private void is_equal_wywolanie() {
        MathEval mathEval = new MathEval();

        try {
            wynik = mathEval.evaluate(display_text);
        } catch (IllegalFormatException e) {
            toast_wypisz("Złe dane wejściowe");
            e.printStackTrace();

        }
        display_text = Double.toString(wynik);
        wyswietlacz.setText(display_text);

        toast_wypisz("jestem w rowna sie");
    }

    private void C_wywolanie() {

        wynik = 0;
        wyswietlacz.setText("0");
        display_text = "";
        temp = "";

    }



    public void toast_wypisz(String tekst) {
        Toast.makeText(getActivity(), tekst,
                Toast.LENGTH_LONG).show();
    }


    //cos
    public void jednooperatorowe_dzialanie(int kod_dzialania) {
        if (temp.isEmpty()) {
            pierwsza_liczba = 0;
        } else {
            pierwsza_liczba = Double.parseDouble(temp);
            temp = "";
        }

        if (czy_jest_juz_pierwsza && czy_jest_juz_operator) {
            toast_wypisz("Nieprawidłowa operacja");
            C_wywolanie();
            toast_wypisz("jednooperatorowe 1, 1");

        } else if (czy_jest_juz_pierwsza && !czy_jest_juz_operator) {

            if (kod_dzialania == 5) {
                //logarytm
                wynik = Math.log(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 6) {
                //pierwiastek
                wynik = Math.sqrt(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 8) {
                //sinx
                wynik = Math.sin(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));

            } else if (kod_dzialania == 9) {
                wynik = Math.cos(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 10) {
                wynik = Math.tan(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 11) {
                //do potegi 2
                wynik = Math.pow(pierwsza_liczba, 2);
                wyswietlacz.setText(Double.toString(wynik));
                toast_wypisz("jednooperatorowe 1, 0");
            }

        } else if (!czy_jest_juz_pierwsza && czy_jest_juz_operator) {
            toast_wypisz("operacja niedozwolona");
            C_wywolanie();

        } else if (!czy_jest_juz_pierwsza && !czy_jest_juz_operator) {
            pierwsza_liczba = 0;
            if (kod_dzialania == 5) {
//logarytm
                wynik = Math.log(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 6) {
                //pierwiastek
                wynik = Math.sqrt(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 8) {
                //sinx
                wynik = Math.sin(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));

            } else if (kod_dzialania == 9) {
                wynik = Math.cos(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 10) {
                wynik = Math.tan(pierwsza_liczba);
                wyswietlacz.setText(Double.toString(wynik));
            } else if (kod_dzialania == 11) {
                wynik = Math.pow(pierwsza_liczba, 2);
                wyswietlacz.setText(Double.toString(wynik));
            }
        }
        czy_jest_juz_pierwsza = false;


    }


}
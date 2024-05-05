package com.belov.double_tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class FieldGame extends AppCompatActivity {
    Button button1_1, button1_2, button1_3, button1_4, button1_5, button1_6, button1_7, button1_8, button1_9,
            button2_1, button2_2, button2_3, button2_4, button2_5, button2_6, button2_7, button2_8, button2_9,
            button3_1, button3_2, button3_3, button3_4, button3_5, button3_6, button3_7, button3_8, button3_9,
            button4_1, button4_2, button4_3, button4_4, button4_5, button4_6, button4_7, button4_8, button4_9,
            button5_1, button5_2, button5_3, button5_4, button5_5, button5_6, button5_7, button5_8, button5_9,
            button6_1, button6_2, button6_3, button6_4, button6_5, button6_6, button6_7, button6_8, button6_9,
            button7_1, button7_2, button7_3, button7_4, button7_5, button7_6, button7_7, button7_8, button7_9,
            button8_1, button8_2, button8_3, button8_4, button8_5, button8_6, button8_7, button8_8, button8_9,
            button9_1, button9_2, button9_3, button9_4, button9_5, button9_6, button9_7, button9_8, button9_9;

    String krestt, nol;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activityfieldgame);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        krestt = "x";
        nol = "0";

        button1_1 = findViewById(R.id.button1_1);
        button1_2 = findViewById(R.id.button1_2);
        button1_3 = findViewById(R.id.button1_3);
        button1_4 = findViewById(R.id.button1_4);
        button1_5 = findViewById(R.id.button1_5);
        button1_6 = findViewById(R.id.button1_6);
        button1_7 = findViewById(R.id.button1_7);
        button1_8 = findViewById(R.id.button1_8);
        button1_9 = findViewById(R.id.button1_9);

        button2_1 = findViewById(R.id.button2_1);
        button2_2 = findViewById(R.id.button2_2);
        button2_3 = findViewById(R.id.button2_3);
        button2_4 = findViewById(R.id.button2_4);
        button2_5 = findViewById(R.id.button2_5);
        button2_6 = findViewById(R.id.button2_6);
        button2_7 = findViewById(R.id.button2_7);
        button2_8 = findViewById(R.id.button2_8);
        button2_9 = findViewById(R.id.button2_9);

        button3_1 = findViewById(R.id.button3_1);
        button3_2 = findViewById(R.id.button3_2);
        button3_3 = findViewById(R.id.button3_3);
        button3_4 = findViewById(R.id.button3_4);
        button3_5 = findViewById(R.id.button3_5);
        button3_6 = findViewById(R.id.button3_6);
        button3_7 = findViewById(R.id.button3_7);
        button3_8 = findViewById(R.id.button3_8);
        button3_9 = findViewById(R.id.button3_9);

        button4_1 = findViewById(R.id.button4_1);
        button4_2 = findViewById(R.id.button4_2);
        button4_3 = findViewById(R.id.button4_3);
        button4_4 = findViewById(R.id.button4_4);
        button4_5 = findViewById(R.id.button4_5);
        button4_6 = findViewById(R.id.button4_6);
        button4_7 = findViewById(R.id.button4_7);
        button4_8 = findViewById(R.id.button4_8);
        button4_9 = findViewById(R.id.button4_9);

        button5_1 = findViewById(R.id.button5_1);
        button5_2 = findViewById(R.id.button5_2);
        button5_3 = findViewById(R.id.button5_3);
        button5_4 = findViewById(R.id.button5_4);
        button5_5 = findViewById(R.id.button5_5);
        button5_6 = findViewById(R.id.button5_6);
        button5_7 = findViewById(R.id.button5_7);
        button5_8 = findViewById(R.id.button5_8);
        button5_9 = findViewById(R.id.button5_9);

        button6_1 = findViewById(R.id.button6_1);
        button6_2 = findViewById(R.id.button6_2);
        button6_3 = findViewById(R.id.button6_3);
        button6_4 = findViewById(R.id.button6_4);
        button6_5 = findViewById(R.id.button6_5);
        button6_6 = findViewById(R.id.button6_6);
        button6_7 = findViewById(R.id.button6_7);
        button6_8 = findViewById(R.id.button6_8);
        button6_9 = findViewById(R.id.button6_9);

        button7_1 = findViewById(R.id.button7_1);
        button7_2 = findViewById(R.id.button7_2);
        button7_3 = findViewById(R.id.button7_3);
        button7_4 = findViewById(R.id.button7_4);
        button7_5 = findViewById(R.id.button7_5);
        button7_6 = findViewById(R.id.button7_6);
        button7_7 = findViewById(R.id.button7_7);
        button7_8 = findViewById(R.id.button7_8);
        button7_9 = findViewById(R.id.button7_9);

        button8_1 = findViewById(R.id.button8_1);
        button8_2 = findViewById(R.id.button8_2);
        button8_3 = findViewById(R.id.button8_3);
        button8_4 = findViewById(R.id.button8_4);
        button8_5 = findViewById(R.id.button8_5);
        button8_6 = findViewById(R.id.button8_6);
        button8_7 = findViewById(R.id.button8_7);
        button8_8 = findViewById(R.id.button8_8);
        button8_9 = findViewById(R.id.button8_9);

        button9_1 = findViewById(R.id.button9_1);
        button9_2 = findViewById(R.id.button9_2);
        button9_3 = findViewById(R.id.button9_3);
        button9_4 = findViewById(R.id.button9_4);
        button9_5 = findViewById(R.id.button9_5);
        button9_6 = findViewById(R.id.button9_6);
        button9_7 = findViewById(R.id.button9_7);
        button9_8 = findViewById(R.id.button9_8);
        button9_9 = findViewById(R.id.button9_9);

        textView = findViewById(R.id.textViewfield);


    }
    public void clcBtn1_1(View view) {
        button1_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_2(View view) {
        button1_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_3(View view) {
        button1_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_4(View view) {
        button1_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_5(View view) {
        button1_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_6(View view) {
        button1_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_7(View view) {
        button1_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_8(View view) {
        button1_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn1_9(View view) {
        button1_9.setText(krestt);
        isPlayerWinner();
    }


    public void clcBtn2_1(View view) {
        button2_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_2(View view) {
        button2_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_3(View view) {
        button2_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_4(View view) {
        button2_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_5(View view) {
        button2_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_6(View view) {
        button2_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_7(View view) {
        button2_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_8(View view) {
        button2_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn2_9(View view) {
        button2_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn3_1(View view) {
        button3_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_2(View view) {
        button3_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_3(View view) {
        button3_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_4(View view) {
        button3_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_5(View view) {
        button3_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_6(View view) {
        button3_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_7(View view) {
        button3_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_8(View view) {
        button3_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn3_9(View view) {
        button3_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn4_1(View view) {
        button4_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_2(View view) {
        button4_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_3(View view) {
        button4_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_4(View view) {
        button4_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_5(View view) {
        button4_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_6(View view) {
        button4_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_7(View view) {
        button4_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_8(View view) {
        button4_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn4_9(View view) {
        button4_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn5_1(View view) {
        button5_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_2(View view) {
        button5_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_3(View view) {
        button5_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_4(View view) {
        button5_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_5(View view) {
        button5_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_6(View view) {
        button5_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_7(View view) {
        button5_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_8(View view) {
        button5_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn5_9(View view) {
        button5_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn6_1(View view) {
        button6_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_2(View view) {
        button6_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_3(View view) {
        button6_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_4(View view) {
        button6_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_5(View view) {
        button6_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_6(View view) {
        button6_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_7(View view) {
        button6_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_8(View view) {
        button6_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn6_9(View view) {
        button6_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn7_1(View view) {
        button7_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_2(View view) {
        button7_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_3(View view) {
        button7_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_4(View view) {
        button7_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_5(View view) {
        button7_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_6(View view) {
        button7_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_7(View view) {
        button7_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_8(View view) {
        button7_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn7_9(View view) {
        button7_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn8_1(View view) {
        button8_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_2(View view) {
        button8_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_3(View view) {
        button8_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_4(View view) {
        button8_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_5(View view) {
        button8_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_6(View view) {
        button8_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_7(View view) {
        button8_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_8(View view) {
        button8_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn8_9(View view) {
        button8_9.setText(krestt);
        isPlayerWinner();
    }

    public void clcBtn9_1(View view) {
        button9_1.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_2(View view) {
        button9_2.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_3(View view) {
        button9_3.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_4(View view) {
        button9_4.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_5(View view) {
        button9_5.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_6(View view) {
        button9_6.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_7(View view) {
        button9_7.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_8(View view) {
        button9_8.setText(krestt);
        isPlayerWinner();
    }
    public void clcBtn9_9(View view) {
        button9_9.setText(krestt);
        isPlayerWinner();
    }

    public void isPlayerWinner () {
        if ((button1_1.getText() == krestt && button1_2.getText() == krestt && button1_3.getText() == krestt
                && button1_4.getText() == krestt && button1_5.getText() == krestt && button1_6.getText() == krestt) ||
                (button1_7.getText() == krestt && button1_2.getText() == krestt && button1_3.getText() == krestt
                        && button1_4.getText() == krestt && button1_5.getText() == krestt && button1_6.getText() == krestt) ||
                (button1_7.getText() == krestt && button1_8.getText() == krestt && button1_3.getText() == krestt
                        && button1_4.getText() == krestt && button1_5.getText() == krestt && button1_6.getText() == krestt) ||
                (button1_7.getText() == krestt && button1_8.getText() == krestt && button1_9.getText() == krestt
                        && button1_4.getText() == krestt && button1_5.getText() == krestt && button1_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button2_1.getText() == krestt && button2_2.getText() == krestt && button2_3.getText() == krestt
                && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_2.getText() == krestt && button2_3.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_8.getText() == krestt && button2_3.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_8.getText() == krestt && button2_9.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button3_1.getText() == krestt && button3_2.getText() == krestt && button3_3.getText() == krestt
                && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_2.getText() == krestt && button3_3.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_8.getText() == krestt && button3_3.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_8.getText() == krestt && button3_9.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button4_1.getText() == krestt && button4_2.getText() == krestt && button4_3.getText() == krestt
                && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_2.getText() == krestt && button4_3.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_8.getText() == krestt && button4_3.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_8.getText() == krestt && button4_9.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button5_1.getText() == krestt && button5_2.getText() == krestt && button5_3.getText() == krestt
                && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_2.getText() == krestt && button5_3.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_8.getText() == krestt && button5_3.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_8.getText() == krestt && button5_9.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button6_1.getText() == krestt && button6_2.getText() == krestt && button6_3.getText() == krestt
                && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_2.getText() == krestt && button6_3.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_8.getText() == krestt && button6_3.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_8.getText() == krestt && button6_9.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button7_1.getText() == krestt && button7_2.getText() == krestt && button7_3.getText() == krestt
                && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_2.getText() == krestt && button7_3.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_8.getText() == krestt && button7_3.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_8.getText() == krestt && button7_9.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button8_1.getText() == krestt && button8_2.getText() == krestt && button8_3.getText() == krestt
                && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_2.getText() == krestt && button8_3.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_8.getText() == krestt && button8_3.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_8.getText() == krestt && button8_9.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button9_1.getText() == krestt && button9_2.getText() == krestt && button9_3.getText() == krestt
                && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_2.getText() == krestt && button9_3.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_8.getText() == krestt && button9_3.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_8.getText() == krestt && button9_9.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }


        if ((button1_1.getText() == krestt && button2_1.getText() == krestt && button3_1.getText() == krestt
                && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button2_1.getText() == krestt && button3_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button8_1.getText() == krestt && button3_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button8_1.getText() == krestt && button9_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }

        if ((button1_2.getText() == krestt && button2_2.getText() == krestt && button3_2.getText() == krestt
                && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button2_2.getText() == krestt && button3_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button8_2.getText() == krestt && button3_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button8_2.getText() == krestt && button9_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }

        if ((button1_3.getText() == krestt && button2_3.getText() == krestt && button3_3.getText() == krestt
                && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button2_3.getText() == krestt && button3_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button8_3.getText() == krestt && button3_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button8_3.getText() == krestt && button9_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }

        if ((button1_4.getText() == krestt && button2_4.getText() == krestt && button3_4.getText() == krestt
                && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button2_4.getText() == krestt && button3_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button8_4.getText() == krestt && button3_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button8_4.getText() == krestt && button9_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button1_5.getText() == krestt && button2_5.getText() == krestt && button3_5.getText() == krestt
                && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button2_5.getText() == krestt && button3_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button8_5.getText() == krestt && button3_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button8_5.getText() == krestt && button9_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button1_6.getText() == krestt && button2_6.getText() == krestt && button3_6.getText() == krestt
                && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button2_6.getText() == krestt && button3_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button8_6.getText() == krestt && button3_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button8_6.getText() == krestt && button9_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button1_7.getText() == krestt && button2_7.getText() == krestt && button3_7.getText() == krestt
                && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button2_7.getText() == krestt && button3_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_7.getText() == krestt && button3_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_7.getText() == krestt && button9_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button1_8.getText() == krestt && button2_8.getText() == krestt && button3_8.getText() == krestt
                && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button2_8.getText() == krestt && button3_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button8_8.getText() == krestt && button3_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button8_8.getText() == krestt && button9_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }
        if ((button1_9.getText() == krestt && button2_9.getText() == krestt && button3_9.getText() == krestt
                && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button2_9.getText() == krestt && button3_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button8_9.getText() == krestt && button3_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button8_9.getText() == krestt && button9_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt)) {
            textView.setText(R.string.winner_message);
        }






    }

}
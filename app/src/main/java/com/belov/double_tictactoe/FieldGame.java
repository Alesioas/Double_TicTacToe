package com.belov.double_tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

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
    TextView textView, humanpoints, iipoints;
    Integer pointsOfHuman = 0, pointsOfPC = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activityfieldgame);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



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
        humanpoints = findViewById(R.id.humanpoints);
        iipoints = findViewById(R.id.iipoints);




        krestt = "x";
        nol = "O";
        textView.setText("");

    }
    public void clcBtn1_1(View view) {
        if ((button1_1.getText() == "") && (textView.getText() == "")){
        button1_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }


    public void clcBtn1_2(View view) {
        if (button1_2.getText() == "" && (textView.getText() == "")){
        button1_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_3(View view) {
        if (button1_3.getText() == "" && (textView.getText() == "")){
        button1_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_4(View view) {
        if (button1_4.getText() == "" && (textView.getText() == "")){
        button1_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_5(View view) {
        if (button1_5.getText() == "" && (textView.getText() == "")){
        button1_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_6(View view) {
        if (button1_6.getText() == "" && (textView.getText() == "")){
        button1_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_7(View view) {
        if (button1_7.getText() == "" && (textView.getText() == "")){
        button1_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_8(View view) {
        if (button1_8.getText() == "" && (textView.getText() == "")){
        button1_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn1_9(View view) {
        if (button1_9.getText() == "" && (textView.getText() == "")){
        button1_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }


    public void clcBtn2_1(View view) {
        if (button2_1.getText() == "" && (textView.getText() == "")){
        button2_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_2(View view) {
        if (button2_2.getText() == "" && (textView.getText() == "")){
        button2_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_3(View view) {
        if (button2_3.getText() == "" && (textView.getText() == "")){
        button2_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_4(View view) {
        if (button2_4.getText() == "" && (textView.getText() == "")){
        button2_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_5(View view) {
        if (button2_5.getText() == "" && (textView.getText() == "")){
        button2_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_6(View view) {
        if (button2_6.getText() == "" && (textView.getText() == "")){
        button2_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_7(View view) {
        if (button2_7.getText() == "" && (textView.getText() == "")){
        button2_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_8(View view) {
        if (button2_8.getText() == "" && (textView.getText() == "")){
        button2_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn2_9(View view) {
        if (button2_9.getText() == "" && (textView.getText() == "")){
        button2_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }

    public void clcBtn3_1(View view) {
        if (button3_1.getText() == "" && (textView.getText() == "")){
        button3_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_2(View view) {
        if (button3_2.getText() == "" && (textView.getText() == "")){
        button3_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_3(View view) {
        if (button3_3.getText() == "" && (textView.getText() == "")){
        button3_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_4(View view) {
        if (button3_4.getText() == "" && (textView.getText() == "")){
        button3_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_5(View view) {
        if (button3_5.getText() == "" && (textView.getText() == "")){
        button3_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_6(View view) {
        if (button3_6.getText() == "" && (textView.getText() == "")){
        button3_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_7(View view) {
        if (button3_7.getText() == "" && (textView.getText() == "")){
        button3_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_8(View view) {
        if (button3_8.getText() == "" && (textView.getText() == "")){
        button3_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn3_9(View view) {
        if (button3_9.getText() == "" && (textView.getText() == "")){
        button3_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }

    public void clcBtn4_1(View view) {
        if (button4_1.getText() == "" && (textView.getText() == "")){
        button4_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn4_2(View view) {
        if (button4_2.getText() == "" && (textView.getText() == "")){
        button4_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn4_3(View view) {
        if (button4_3.getText() == "" && (textView.getText() == "")){
        button4_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn4_4(View view) {
        if (button4_4.getText() == "" && (textView.getText() == "")){
        button4_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn4_5(View view) {
        if (button4_5.getText() == "" && (textView.getText() == "")){
        button4_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }

    }
    public void clcBtn4_6(View view) {
        if (button4_6.getText() == "" && (textView.getText() == "")){
        button4_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn4_7(View view) {
        if (button4_7.getText() == "" && (textView.getText() == "")){
        button4_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn4_8(View view) {
        if (button4_8.getText() == "" && (textView.getText() == "")){
        button4_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn4_9(View view) {
        if (button4_9.getText() == "" && (textView.getText() == "")){
        button4_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clcBtn5_1(View view) {
        if (button5_1.getText() == "" && (textView.getText() == "")){
        button5_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_2(View view) {
        if (button5_2.getText() == "" && (textView.getText() == "")){
        button5_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_3(View view) {
        if (button5_3.getText() == "" && (textView.getText() == "")){
        button5_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_4(View view) {
        if (button5_4.getText() == "" && (textView.getText() == "")){
        button5_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_5(View view) {
        if (button5_5.getText() == "" && (textView.getText() == "")){
        button5_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_6(View view) {
        if (button5_6.getText() == "" && (textView.getText() == "")){
        button5_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_7(View view) {
        if (button5_7.getText() == "" && (textView.getText() == "")){
        button5_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_8(View view) {
        if (button5_8.getText() == "" && (textView.getText() == "")){
        button5_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn5_9(View view) {
        if (button5_9.getText() == "" && (textView.getText() == "")){
        button5_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clcBtn6_1(View view) {
        if (button6_1.getText() == "" && (textView.getText() == "")){
        button6_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_2(View view) {
        if (button6_2.getText() == "" && (textView.getText() == "")){
        button6_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_3(View view) {
        if (button6_3.getText() == "" && (textView.getText() == "")){
        button6_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_4(View view) {
        if (button6_4.getText() == "" && (textView.getText() == "")){
        button6_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_5(View view) {
        if (button6_5.getText() == "" && (textView.getText() == "")){
        button6_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_6(View view) {
        if (button6_6.getText() == "" && (textView.getText() == "")){
        button6_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_7(View view) {
        if (button6_7.getText() == "" && (textView.getText() == "")){
        button6_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_8(View view) {
        if (button6_8.getText() == "" && (textView.getText() == "")){
        button6_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn6_9(View view) {
        if (button6_9.getText() == "" && (textView.getText() == "")){
        button6_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clcBtn7_1(View view) {
        if (button7_1.getText() == "" && (textView.getText() == "")){
        button7_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_2(View view) {
        if (button7_2.getText() == "" && (textView.getText() == "")){
        button7_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_3(View view) {
        if (button7_3.getText() == "" && (textView.getText() == "")){
        button7_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_4(View view) {
        if (button7_4.getText() == "" && (textView.getText() == "")){
        button7_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_5(View view) {
        if (button7_5.getText() == "" && (textView.getText() == "")){
        button7_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_6(View view) {
        if (button7_6.getText() == "" && (textView.getText() == "")){
        button7_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_7(View view) {
        if (button7_7.getText() == "" && (textView.getText() == "")){
        button7_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_8(View view) {
        if (button7_8.getText() == "" && (textView.getText() == "")){
        button7_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn7_9(View view) {
        if (button7_9.getText() == "" && (textView.getText() == "")){
        button7_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clcBtn8_1(View view) {
        if (button8_1.getText() == "" && (textView.getText() == "")){
        button8_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_2(View view) {
        if (button8_2.getText() == "" && (textView.getText() == "")){
        button8_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_3(View view) {
        if (button8_3.getText() == "" && (textView.getText() == "")){
        button8_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_4(View view) {
        if (button8_4.getText() == "" && (textView.getText() == "")){
        button8_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_5(View view) {
        if (button8_5.getText() == "" && (textView.getText() == "")){
        button8_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_6(View view) {
        if (button8_6.getText() == "" && (textView.getText() == "")){
        button8_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_7(View view) {
        if (button8_7.getText() == "" && (textView.getText() == "")){
        button8_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_8(View view) {
        if (button8_8.getText() == "" && (textView.getText() == "")){
        button8_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn8_9(View view) {
        if (button8_9.getText() == "" && (textView.getText() == "")){
        button8_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }

    public void clcBtn9_1(View view) {
        if (button9_1.getText() == "" && (textView.getText() == "")){
        button9_1.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_2(View view) {
        if (button9_2.getText() == "" && (textView.getText() == "")){
        button9_2.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_3(View view) {
        if (button9_3.getText() == "" && (textView.getText() == "")){
        button9_3.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_4(View view) {
        if (button9_4.getText() == "" && (textView.getText() == "")){
        button9_4.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_5(View view) {
        if (button9_5.getText() == "" && (textView.getText() == "")){
        button9_5.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_6(View view) {
        if (button9_6.getText() == "" && (textView.getText() == "")){
        button9_6.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_7(View view) {
        if (button9_7.getText() == "" && (textView.getText() == "")){
        button9_7.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_8(View view) {
        if (button9_8.getText() == "" && (textView.getText() == "")){
        button9_8.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
    }
    public void clcBtn9_9(View view) {
        if (button9_9.getText() == "" && (textView.getText() == "")){
        button9_9.setText(krestt);
        isPlayerWinner();
            if (textView.getText() == "") {
                hodPC();
            }
        }
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
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);

        } else
        if ((button2_1.getText() == krestt && button2_2.getText() == krestt && button2_3.getText() == krestt
                && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_2.getText() == krestt && button2_3.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_8.getText() == krestt && button2_3.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button2_8.getText() == krestt && button2_9.getText() == krestt
                        && button2_4.getText() == krestt && button2_5.getText() == krestt && button2_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button3_1.getText() == krestt && button3_2.getText() == krestt && button3_3.getText() == krestt
                && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_2.getText() == krestt && button3_3.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_8.getText() == krestt && button3_3.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button3_8.getText() == krestt && button3_9.getText() == krestt
                        && button3_4.getText() == krestt && button3_5.getText() == krestt && button3_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button4_1.getText() == krestt && button4_2.getText() == krestt && button4_3.getText() == krestt
                && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_2.getText() == krestt && button4_3.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_8.getText() == krestt && button4_3.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button4_7.getText() == krestt && button4_8.getText() == krestt && button4_9.getText() == krestt
                        && button4_4.getText() == krestt && button4_5.getText() == krestt && button4_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button5_1.getText() == krestt && button5_2.getText() == krestt && button5_3.getText() == krestt
                && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_2.getText() == krestt && button5_3.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_8.getText() == krestt && button5_3.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt) ||
                (button5_7.getText() == krestt && button5_8.getText() == krestt && button5_9.getText() == krestt
                        && button5_4.getText() == krestt && button5_5.getText() == krestt && button5_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button6_1.getText() == krestt && button6_2.getText() == krestt && button6_3.getText() == krestt
                && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_2.getText() == krestt && button6_3.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_8.getText() == krestt && button6_3.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button6_7.getText() == krestt && button6_8.getText() == krestt && button6_9.getText() == krestt
                        && button6_4.getText() == krestt && button6_5.getText() == krestt && button6_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button7_1.getText() == krestt && button7_2.getText() == krestt && button7_3.getText() == krestt
                && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_2.getText() == krestt && button7_3.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_8.getText() == krestt && button7_3.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button7_8.getText() == krestt && button7_9.getText() == krestt
                        && button7_4.getText() == krestt && button7_5.getText() == krestt && button7_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button8_1.getText() == krestt && button8_2.getText() == krestt && button8_3.getText() == krestt
                && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_2.getText() == krestt && button8_3.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_8.getText() == krestt && button8_3.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button8_8.getText() == krestt && button8_9.getText() == krestt
                        && button8_4.getText() == krestt && button8_5.getText() == krestt && button8_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button9_1.getText() == krestt && button9_2.getText() == krestt && button9_3.getText() == krestt
                && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_2.getText() == krestt && button9_3.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_8.getText() == krestt && button9_3.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button9_8.getText() == krestt && button9_9.getText() == krestt
                        && button9_4.getText() == krestt && button9_5.getText() == krestt && button9_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else


        if ((button1_1.getText() == krestt && button2_1.getText() == krestt && button3_1.getText() == krestt
                && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button2_1.getText() == krestt && button3_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button8_1.getText() == krestt && button3_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt) ||
                (button7_1.getText() == krestt && button8_1.getText() == krestt && button9_1.getText() == krestt
                        && button4_1.getText() == krestt && button5_1.getText() == krestt && button6_1.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button1_2.getText() == krestt && button2_2.getText() == krestt && button3_2.getText() == krestt
                && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button2_2.getText() == krestt && button3_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button8_2.getText() == krestt && button3_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt) ||
                (button7_2.getText() == krestt && button8_2.getText() == krestt && button9_2.getText() == krestt
                        && button4_2.getText() == krestt && button5_2.getText() == krestt && button6_2.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button1_3.getText() == krestt && button2_3.getText() == krestt && button3_3.getText() == krestt
                && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button2_3.getText() == krestt && button3_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button8_3.getText() == krestt && button3_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt) ||
                (button7_3.getText() == krestt && button8_3.getText() == krestt && button9_3.getText() == krestt
                        && button4_3.getText() == krestt && button5_3.getText() == krestt && button6_3.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button1_4.getText() == krestt && button2_4.getText() == krestt && button3_4.getText() == krestt
                && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button2_4.getText() == krestt && button3_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button8_4.getText() == krestt && button3_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt) ||
                (button7_4.getText() == krestt && button8_4.getText() == krestt && button9_4.getText() == krestt
                        && button4_4.getText() == krestt && button5_4.getText() == krestt && button6_4.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button1_5.getText() == krestt && button2_5.getText() == krestt && button3_5.getText() == krestt
                && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button2_5.getText() == krestt && button3_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button8_5.getText() == krestt && button3_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt) ||
                (button7_5.getText() == krestt && button8_5.getText() == krestt && button9_5.getText() == krestt
                        && button4_5.getText() == krestt && button5_5.getText() == krestt && button6_5.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button1_6.getText() == krestt && button2_6.getText() == krestt && button3_6.getText() == krestt
                && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button2_6.getText() == krestt && button3_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button8_6.getText() == krestt && button3_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_6.getText() == krestt && button8_6.getText() == krestt && button9_6.getText() == krestt
                        && button4_6.getText() == krestt && button5_6.getText() == krestt && button6_6.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button1_7.getText() == krestt && button2_7.getText() == krestt && button3_7.getText() == krestt
                && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button2_7.getText() == krestt && button3_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_7.getText() == krestt && button3_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_7.getText() == krestt && button9_7.getText() == krestt
                        && button4_7.getText() == krestt && button5_7.getText() == krestt && button6_7.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button1_8.getText() == krestt && button2_8.getText() == krestt && button3_8.getText() == krestt
                && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button2_8.getText() == krestt && button3_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button8_8.getText() == krestt && button3_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_8.getText() == krestt && button8_8.getText() == krestt && button9_8.getText() == krestt
                        && button4_8.getText() == krestt && button5_8.getText() == krestt && button6_8.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else
        if ((button1_9.getText() == krestt && button2_9.getText() == krestt && button3_9.getText() == krestt
                && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button2_9.getText() == krestt && button3_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button8_9.getText() == krestt && button3_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt) ||
                (button7_9.getText() == krestt && button8_9.getText() == krestt && button9_9.getText() == krestt
                        && button4_9.getText() == krestt && button5_9.getText() == krestt && button6_9.getText() == krestt)) {
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button4_1.getText() == krestt && button5_2.getText() == krestt && button6_3.getText() == krestt
                && button7_4.getText() == krestt && button8_5.getText() == krestt && button9_6.getText() == krestt) ||
                (button1_4.getText() == krestt && button2_5.getText() == krestt && button3_6.getText() == krestt
                        && button4_7.getText() == krestt && button5_8.getText() == krestt && button6_9.getText() == krestt) ||
                (button3_1.getText() == krestt && button4_2.getText() == krestt && button5_3.getText() == krestt
                        && button6_4.getText() == krestt && button7_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button9_7.getText() == krestt && button4_2.getText() == krestt && button5_3.getText() == krestt
                        && button6_4.getText() == krestt && button7_5.getText() == krestt && button8_6.getText() == krestt) ||
                (button1_3.getText() == krestt && button2_4.getText() == krestt && button3_5.getText() == krestt
                        && button4_6.getText() == krestt && button5_7.getText() == krestt && button6_8.getText() == krestt) ||
                (button7_9.getText() == krestt && button2_4.getText() == krestt && button3_5.getText() == krestt
                        && button4_6.getText() == krestt && button5_7.getText() == krestt && button6_8.getText() == krestt)
        ){
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button1_2.getText() == krestt && button2_3.getText() == krestt && button3_4.getText() == krestt
                && button4_5.getText() == krestt && button5_6.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_8.getText() == krestt && button2_3.getText() == krestt && button3_4.getText() == krestt
                        && button4_5.getText() == krestt && button5_6.getText() == krestt && button6_7.getText() == krestt) ||
                (button7_8.getText() == krestt && button8_9.getText() == krestt && button3_4.getText() == krestt
                        && button4_5.getText() == krestt && button5_6.getText() == krestt && button6_7.getText() == krestt) ||
                (button2_1.getText() == krestt && button3_2.getText() == krestt && button4_3.getText() == krestt
                        && button5_4.getText() == krestt && button6_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button3_2.getText() == krestt && button4_3.getText() == krestt
                        && button5_4.getText() == krestt && button6_5.getText() == krestt && button7_6.getText() == krestt) ||
                (button8_7.getText() == krestt && button9_8.getText() == krestt && button4_3.getText() == krestt
                        && button5_4.getText() == krestt && button6_5.getText() == krestt && button7_6.getText() == krestt) ||

                (button1_1.getText() == krestt && button2_2.getText() == krestt && button3_3.getText() == krestt
                        && button4_4.getText() == krestt && button5_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button2_2.getText() == krestt && button3_3.getText() == krestt
                        && button4_4.getText() == krestt && button5_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_8.getText() == krestt && button3_3.getText() == krestt
                        && button4_4.getText() == krestt && button5_5.getText() == krestt && button6_6.getText() == krestt) ||
                (button7_7.getText() == krestt && button8_8.getText() == krestt && button9_9.getText() == krestt
                        && button4_4.getText() == krestt && button5_5.getText() == krestt && button6_6.getText() == krestt)
        ){
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        }else

        if ((button6_1.getText() == krestt && button5_2.getText() == krestt && button4_3.getText() == krestt
                && button3_4.getText() == krestt && button2_5.getText() == krestt && button1_6.getText() == krestt) ||
                (button9_4.getText() == krestt && button8_5.getText() == krestt && button7_6.getText() == krestt
                        && button6_7.getText() == krestt && button5_8.getText() == krestt && button4_9.getText() == krestt) ||

                (button7_1.getText() == krestt && button6_2.getText() == krestt && button5_3.getText() == krestt
                        && button4_4.getText() == krestt && button3_5.getText() == krestt && button2_6.getText() == krestt) ||
                (button1_7.getText() == krestt && button6_2.getText() == krestt && button5_3.getText() == krestt
                        && button4_4.getText() == krestt && button3_5.getText() == krestt && button2_6.getText() == krestt) ||

                (button9_3.getText() == krestt && button8_4.getText() == krestt && button7_5.getText() == krestt
                        && button6_6.getText() == krestt && button5_7.getText() == krestt && button4_8.getText() == krestt) ||
                (button3_9.getText() == krestt && button8_4.getText() == krestt && button7_5.getText() == krestt
                        && button6_6.getText() == krestt && button5_7.getText() == krestt && button4_8.getText() == krestt) ||

                (button8_1.getText() == krestt && button7_2.getText() == krestt && button6_3.getText() == krestt
                        && button5_4.getText() == krestt && button4_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button7_2.getText() == krestt && button6_3.getText() == krestt
                        && button5_4.getText() == krestt && button4_5.getText() == krestt && button3_6.getText() == krestt) ||
                (button2_7.getText() == krestt && button1_8.getText() == krestt && button6_3.getText() == krestt
                        && button5_4.getText() == krestt && button4_5.getText() == krestt && button3_6.getText() == krestt) ||

                (button9_2.getText() == krestt && button8_3.getText() == krestt && button7_4.getText() == krestt
                        && button6_5.getText() == krestt && button5_6.getText() == krestt && button4_7.getText() == krestt) ||
                (button3_8.getText() == krestt && button8_3.getText() == krestt && button7_4.getText() == krestt
                        && button6_5.getText() == krestt && button5_6.getText() == krestt && button4_7.getText() == krestt) ||
                (button3_8.getText() == krestt && button2_9.getText() == krestt && button7_4.getText() == krestt
                        && button6_5.getText() == krestt && button5_6.getText() == krestt && button4_7.getText() == krestt) ||


                (button9_1.getText() == krestt && button8_2.getText() == krestt && button7_3.getText() == krestt
                        && button6_4.getText() == krestt && button5_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button8_2.getText() == krestt && button7_3.getText() == krestt
                        && button6_4.getText() == krestt && button5_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button2_8.getText() == krestt && button7_3.getText() == krestt
                        && button6_4.getText() == krestt && button5_5.getText() == krestt && button4_6.getText() == krestt) ||
                (button3_7.getText() == krestt && button2_8.getText() == krestt && button1_9.getText() == krestt
                        && button6_4.getText() == krestt && button5_5.getText() == krestt && button4_6.getText() == krestt)
        ){
            textView.setText(R.string.winner_message);
            pointsOfHuman++;
            humanpoints.setText(""+pointsOfHuman);
        } else
        if (
                button1_1.getText() !=  "" && button1_2.getText() !=  "" && button1_3.getText() !=  ""
                        && button1_4.getText() != ""  && button1_5.getText() !=  "" && button1_6.getText() !=""
                        && button1_7.getText() != ""  && button1_8.getText() != ""  && button1_9.getText() !=""
                        && button2_1.getText() != ""  && button2_2.getText() != ""  && button2_3.getText() !=""
                        && button2_4.getText() != ""  && button2_5.getText() != ""  && button2_6.getText() !=""
                        && button2_7.getText() != ""  && button2_8.getText() != ""  && button2_9.getText() !=""
                        && button3_1.getText() != ""  && button3_2.getText() != ""  && button3_3.getText() !=""
                        && button3_4.getText() != ""  && button3_5.getText() != ""  && button3_6.getText() !=""
                        && button3_7.getText() != ""  && button3_8.getText() != ""  && button3_9.getText() !=""
                        && button4_1.getText() != ""  && button4_2.getText() != ""  && button4_3.getText() !=""
                        && button4_4.getText() != ""  && button4_5.getText() != ""  && button4_6.getText() !=""
                        && button4_7.getText() != ""  && button4_8.getText() != ""  && button4_9.getText() !=""
                        && button5_1.getText() != ""  && button5_2.getText() != ""  && button5_3.getText() !=""
                        && button5_4.getText() != ""  && button5_5.getText() != ""  && button5_6.getText() !=""
                        && button5_7.getText() != ""  && button5_8.getText() != ""  && button5_9.getText() !=""
                        && button6_1.getText() != ""  && button6_2.getText() != ""  && button6_3.getText() !=""
                        && button6_4.getText() != ""  && button6_5.getText() != ""  && button6_6.getText() !=""
                        && button6_7.getText() != ""  && button6_8.getText() != ""  && button6_9.getText() !=""
                        && button7_1.getText() != ""  && button7_2.getText() != ""  && button7_3.getText() !=""
                        && button7_4.getText() != ""  && button7_5.getText() != ""  && button7_6.getText() !=""
                        && button7_7.getText() != ""  && button7_8.getText() != ""  && button7_9.getText() !=""
                        && button8_1.getText() != ""  && button8_2.getText() != ""  && button8_3.getText() !=""
                        && button8_4.getText() != ""  && button8_5.getText() != ""  && button8_6.getText() !=""
                        && button8_7.getText() !=  "" && button8_8.getText() != ""  && button8_9.getText() !=""
                        && button9_1.getText() != ""  && button9_2.getText() != ""  && button9_3.getText() !=""
                        && button9_4.getText() != ""  && button9_5.getText() != ""  && button9_6.getText() !=""
                        && button9_7.getText() != ""  && button9_8.getText() != ""  && button9_9.getText() !=""




        ){
            textView.setText(R.string.draw_message);
        }

    }

    public void isPCWinner () {
        if ((button1_1.getText() == nol && button1_2.getText() == nol && button1_3.getText() == nol
                && button1_4.getText() == nol && button1_5.getText() == nol && button1_6.getText() == nol) ||
                (button1_7.getText() == nol && button1_2.getText() == nol && button1_3.getText() == nol
                        && button1_4.getText() == nol && button1_5.getText() == nol && button1_6.getText() == nol) ||
                (button1_7.getText() == nol && button1_8.getText() == nol && button1_3.getText() == nol
                        && button1_4.getText() == nol && button1_5.getText() == nol && button1_6.getText() == nol) ||
                (button1_7.getText() == nol && button1_8.getText() == nol && button1_9.getText() == nol
                        && button1_4.getText() == nol && button1_5.getText() == nol && button1_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+ pointsOfPC);
        }else
        if ((button2_1.getText() == nol && button2_2.getText() == nol && button2_3.getText() == nol
                && button2_4.getText() == nol && button2_5.getText() == nol && button2_6.getText() == nol) ||
                (button2_7.getText() == nol && button2_2.getText() == nol && button2_3.getText() == nol
                        && button2_4.getText() == nol && button2_5.getText() == nol && button2_6.getText() == nol) ||
                (button2_7.getText() == nol && button2_8.getText() == nol && button2_3.getText() == nol
                        && button2_4.getText() == nol && button2_5.getText() == nol && button2_6.getText() == nol) ||
                (button2_7.getText() == nol && button2_8.getText() == nol && button2_9.getText() == nol
                        && button2_4.getText() == nol && button2_5.getText() == nol && button2_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+ pointsOfPC);
        }else
        if ((button3_1.getText() == nol && button3_2.getText() == nol && button3_3.getText() == nol
                && button3_4.getText() == nol && button3_5.getText() == nol && button3_6.getText() == nol) ||
                (button3_7.getText() == nol && button3_2.getText() == nol && button3_3.getText() == nol
                        && button3_4.getText() == nol && button3_5.getText() == nol && button3_6.getText() == nol) ||
                (button3_7.getText() == nol && button3_8.getText() == nol && button3_3.getText() == nol
                        && button3_4.getText() == nol && button3_5.getText() == nol && button3_6.getText() == nol) ||
                (button3_7.getText() == nol && button3_8.getText() == nol && button3_9.getText() == nol
                        && button3_4.getText() == nol && button3_5.getText() == nol && button3_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button4_1.getText() == nol && button4_2.getText() == nol && button4_3.getText() == nol
                && button4_4.getText() == nol && button4_5.getText() == nol && button4_6.getText() == nol) ||
                (button4_7.getText() == nol && button4_2.getText() == nol && button4_3.getText() == nol
                        && button4_4.getText() == nol && button4_5.getText() == nol && button4_6.getText() == nol) ||
                (button4_7.getText() == nol && button4_8.getText() == nol && button4_3.getText() == nol
                        && button4_4.getText() == nol && button4_5.getText() == nol && button4_6.getText() == nol) ||
                (button4_7.getText() == nol && button4_8.getText() == nol && button4_9.getText() == nol
                        && button4_4.getText() == nol && button4_5.getText() == nol && button4_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button5_1.getText() == nol && button5_2.getText() == nol && button5_3.getText() == nol
                && button5_4.getText() == nol && button5_5.getText() == nol && button5_6.getText() == nol) ||
                (button5_7.getText() == nol && button5_2.getText() == nol && button5_3.getText() == nol
                        && button5_4.getText() == nol && button5_5.getText() == nol && button5_6.getText() == nol) ||
                (button5_7.getText() == nol && button5_8.getText() == nol && button5_3.getText() == nol
                        && button5_4.getText() == nol && button5_5.getText() == nol && button5_6.getText() == nol) ||
                (button5_7.getText() == nol && button5_8.getText() == nol && button5_9.getText() == nol
                        && button5_4.getText() == nol && button5_5.getText() == nol && button5_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button6_1.getText() == nol && button6_2.getText() == nol && button6_3.getText() == nol
                && button6_4.getText() == nol && button6_5.getText() == nol && button6_6.getText() == nol) ||
                (button6_7.getText() == nol && button6_2.getText() == nol && button6_3.getText() == nol
                        && button6_4.getText() == nol && button6_5.getText() == nol && button6_6.getText() == nol) ||
                (button6_7.getText() == nol && button6_8.getText() == nol && button6_3.getText() == nol
                        && button6_4.getText() == nol && button6_5.getText() == nol && button6_6.getText() == nol) ||
                (button6_7.getText() == nol && button6_8.getText() == nol && button6_9.getText() == nol
                        && button6_4.getText() == nol && button6_5.getText() == nol && button6_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button7_1.getText() == nol && button7_2.getText() == nol && button7_3.getText() == nol
                && button7_4.getText() == nol && button7_5.getText() == nol && button7_6.getText() == nol) ||
                (button7_7.getText() == nol && button7_2.getText() == nol && button7_3.getText() == nol
                        && button7_4.getText() == nol && button7_5.getText() == nol && button7_6.getText() == nol) ||
                (button7_7.getText() == nol && button7_8.getText() == nol && button7_3.getText() == nol
                        && button7_4.getText() == nol && button7_5.getText() == nol && button7_6.getText() == nol) ||
                (button7_7.getText() == nol && button7_8.getText() == nol && button7_9.getText() == nol
                        && button7_4.getText() == nol && button7_5.getText() == nol && button7_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button8_1.getText() == nol && button8_2.getText() == nol && button8_3.getText() == nol
                && button8_4.getText() == nol && button8_5.getText() == nol && button8_6.getText() == nol) ||
                (button8_7.getText() == nol && button8_2.getText() == nol && button8_3.getText() == nol
                        && button8_4.getText() == nol && button8_5.getText() == nol && button8_6.getText() == nol) ||
                (button8_7.getText() == nol && button8_8.getText() == nol && button8_3.getText() == nol
                        && button8_4.getText() == nol && button8_5.getText() == nol && button8_6.getText() == nol) ||
                (button8_7.getText() == nol && button8_8.getText() == nol && button8_9.getText() == nol
                        && button8_4.getText() == nol && button8_5.getText() == nol && button8_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button9_1.getText() == nol && button9_2.getText() == nol && button9_3.getText() == nol
                && button9_4.getText() == nol && button9_5.getText() == nol && button9_6.getText() == nol) ||
                (button9_7.getText() == nol && button9_2.getText() == nol && button9_3.getText() == nol
                        && button9_4.getText() == nol && button9_5.getText() == nol && button9_6.getText() == nol) ||
                (button9_7.getText() == nol && button9_8.getText() == nol && button9_3.getText() == nol
                        && button9_4.getText() == nol && button9_5.getText() == nol && button9_6.getText() == nol) ||
                (button9_7.getText() == nol && button9_8.getText() == nol && button9_9.getText() == nol
                        && button9_4.getText() == nol && button9_5.getText() == nol && button9_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else


        if ((button1_1.getText() == nol && button2_1.getText() == nol && button3_1.getText() == nol
                && button4_1.getText() == nol && button5_1.getText() == nol && button6_1.getText() == nol) ||
                (button7_1.getText() == nol && button2_1.getText() == nol && button3_1.getText() == nol
                        && button4_1.getText() == nol && button5_1.getText() == nol && button6_1.getText() == nol) ||
                (button7_1.getText() == nol && button8_1.getText() == nol && button3_1.getText() == nol
                        && button4_1.getText() == nol && button5_1.getText() == nol && button6_1.getText() == nol) ||
                (button7_1.getText() == nol && button8_1.getText() == nol && button9_1.getText() == nol
                        && button4_1.getText() == nol && button5_1.getText() == nol && button6_1.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else

        if ((button1_2.getText() == nol && button2_2.getText() == nol && button3_2.getText() == nol
                && button4_2.getText() == nol && button5_2.getText() == nol && button6_2.getText() == nol) ||
                (button7_2.getText() == nol && button2_2.getText() == nol && button3_2.getText() == nol
                        && button4_2.getText() == nol && button5_2.getText() == nol && button6_2.getText() == nol) ||
                (button7_2.getText() == nol && button8_2.getText() == nol && button3_2.getText() == nol
                        && button4_2.getText() == nol && button5_2.getText() == nol && button6_2.getText() == nol) ||
                (button7_2.getText() == nol && button8_2.getText() == nol && button9_2.getText() == nol
                        && button4_2.getText() == nol && button5_2.getText() == nol && button6_2.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else

        if ((button1_3.getText() == nol && button2_3.getText() == nol && button3_3.getText() == nol
                && button4_3.getText() == nol && button5_3.getText() == nol && button6_3.getText() == nol) ||
                (button7_3.getText() == nol && button2_3.getText() == nol && button3_3.getText() == nol
                        && button4_3.getText() == nol && button5_3.getText() == nol && button6_3.getText() == nol) ||
                (button7_3.getText() == nol && button8_3.getText() == nol && button3_3.getText() == nol
                        && button4_3.getText() == nol && button5_3.getText() == nol && button6_3.getText() == nol) ||
                (button7_3.getText() == nol && button8_3.getText() == nol && button9_3.getText() == nol
                        && button4_3.getText() == nol && button5_3.getText() == nol && button6_3.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else

        if ((button1_4.getText() == nol && button2_4.getText() == nol && button3_4.getText() == nol
                && button4_4.getText() == nol && button5_4.getText() == nol && button6_4.getText() == nol) ||
                (button7_4.getText() == nol && button2_4.getText() == nol && button3_4.getText() == nol
                        && button4_4.getText() == nol && button5_4.getText() == nol && button6_4.getText() == nol) ||
                (button7_4.getText() == nol && button8_4.getText() == nol && button3_4.getText() == nol
                        && button4_4.getText() == nol && button5_4.getText() == nol && button6_4.getText() == nol) ||
                (button7_4.getText() == nol && button8_4.getText() == nol && button9_4.getText() == nol
                        && button4_4.getText() == nol && button5_4.getText() == nol && button6_4.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button1_5.getText() == nol && button2_5.getText() == nol && button3_5.getText() == nol
                && button4_5.getText() == nol && button5_5.getText() == nol && button6_5.getText() == nol) ||
                (button7_5.getText() == nol && button2_5.getText() == nol && button3_5.getText() == nol
                        && button4_5.getText() == nol && button5_5.getText() == nol && button6_5.getText() == nol) ||
                (button7_5.getText() == nol && button8_5.getText() == nol && button3_5.getText() == nol
                        && button4_5.getText() == nol && button5_5.getText() == nol && button6_5.getText() == nol) ||
                (button7_5.getText() == nol && button8_5.getText() == nol && button9_5.getText() == nol
                        && button4_5.getText() == nol && button5_5.getText() == nol && button6_5.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button1_6.getText() == nol && button2_6.getText() == nol && button3_6.getText() == nol
                && button4_6.getText() == nol && button5_6.getText() == nol && button6_6.getText() == nol) ||
                (button7_6.getText() == nol && button2_6.getText() == nol && button3_6.getText() == nol
                        && button4_6.getText() == nol && button5_6.getText() == nol && button6_6.getText() == nol) ||
                (button7_6.getText() == nol && button8_6.getText() == nol && button3_6.getText() == nol
                        && button4_6.getText() == nol && button5_6.getText() == nol && button6_6.getText() == nol) ||
                (button7_6.getText() == nol && button8_6.getText() == nol && button9_6.getText() == nol
                        && button4_6.getText() == nol && button5_6.getText() == nol && button6_6.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button1_7.getText() == nol && button2_7.getText() == nol && button3_7.getText() == nol
                && button4_7.getText() == nol && button5_7.getText() == nol && button6_7.getText() == nol) ||
                (button7_7.getText() == nol && button2_7.getText() == nol && button3_7.getText() == nol
                        && button4_7.getText() == nol && button5_7.getText() == nol && button6_7.getText() == nol) ||
                (button7_7.getText() == nol && button8_7.getText() == nol && button3_7.getText() == nol
                        && button4_7.getText() == nol && button5_7.getText() == nol && button6_7.getText() == nol) ||
                (button7_7.getText() == nol && button8_7.getText() == nol && button9_7.getText() == nol
                        && button4_7.getText() == nol && button5_7.getText() == nol && button6_7.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button1_8.getText() == nol && button2_8.getText() == nol && button3_8.getText() == nol
                && button4_8.getText() == nol && button5_8.getText() == nol && button6_8.getText() == nol) ||
                (button7_8.getText() == nol && button2_8.getText() == nol && button3_8.getText() == nol
                        && button4_8.getText() == nol && button5_8.getText() == nol && button6_8.getText() == nol) ||
                (button7_8.getText() == nol && button8_8.getText() == nol && button3_8.getText() == nol
                        && button4_8.getText() == nol && button5_8.getText() == nol && button6_8.getText() == nol) ||
                (button7_8.getText() == nol && button8_8.getText() == nol && button9_8.getText() == nol
                        && button4_8.getText() == nol && button5_8.getText() == nol && button6_8.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else
        if ((button1_9.getText() == nol && button2_9.getText() == nol && button3_9.getText() == nol
                && button4_9.getText() == nol && button5_9.getText() == nol && button6_9.getText() == nol) ||
                (button7_9.getText() == nol && button2_9.getText() == nol && button3_9.getText() == nol
                        && button4_9.getText() == nol && button5_9.getText() == nol && button6_9.getText() == nol) ||
                (button7_9.getText() == nol && button8_9.getText() == nol && button3_9.getText() == nol
                        && button4_9.getText() == nol && button5_9.getText() == nol && button6_9.getText() == nol) ||
                (button7_9.getText() == nol && button8_9.getText() == nol && button9_9.getText() == nol
                        && button4_9.getText() == nol && button5_9.getText() == nol && button6_9.getText() == nol)) {
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else

        if ((button4_1.getText() == nol && button5_2.getText() == nol && button6_3.getText() == nol
                && button7_4.getText() == nol && button8_5.getText() == nol && button9_6.getText() == nol) ||
                (button1_4.getText() == nol && button2_5.getText() == nol && button3_6.getText() == nol
                        && button4_7.getText() == nol && button5_8.getText() == nol && button6_9.getText() == nol) ||
                (button3_1.getText() == nol && button4_2.getText() == nol && button5_3.getText() == nol
                        && button6_4.getText() == nol && button7_5.getText() == nol && button8_6.getText() == nol) ||
                (button9_7.getText() == nol && button4_2.getText() == nol && button5_3.getText() == nol
                        && button6_4.getText() == nol && button7_5.getText() == nol && button8_6.getText() == nol) ||
                (button1_3.getText() == nol && button2_4.getText() == nol && button3_5.getText() == nol
                        && button4_6.getText() == nol && button5_7.getText() == nol && button6_8.getText() == nol) ||
                (button7_9.getText() == nol && button2_4.getText() == nol && button3_5.getText() == nol
                        && button4_6.getText() == nol && button5_7.getText() == nol && button6_8.getText() == nol)
        ){
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }
        else
        if ((button1_2.getText() == nol && button2_3.getText() == nol && button3_4.getText() == nol
                && button4_5.getText() == nol && button5_6.getText() == nol && button6_7.getText() == nol) ||
                (button7_8.getText() == nol && button2_3.getText() == nol && button3_4.getText() == nol
                        && button4_5.getText() == nol && button5_6.getText() == nol && button6_7.getText() == nol) ||
                (button7_8.getText() == nol && button8_9.getText() == nol && button3_4.getText() == nol
                        && button4_5.getText() == nol && button5_6.getText() == nol && button6_7.getText() == nol) ||
                (button2_1.getText() == nol && button3_2.getText() == nol && button4_3.getText() == nol
                        && button5_4.getText() == nol && button6_5.getText() == nol && button7_6.getText() == nol) ||
                (button8_7.getText() == nol && button3_2.getText() == nol && button4_3.getText() == nol
                        && button5_4.getText() == nol && button6_5.getText() == nol && button7_6.getText() == nol) ||
                (button8_7.getText() == nol && button9_8.getText() == nol && button4_3.getText() == nol
                        && button5_4.getText() == nol && button6_5.getText() == nol && button7_6.getText() == nol) ||

                (button1_1.getText() == nol && button2_2.getText() == nol && button3_3.getText() == nol
                        && button4_4.getText() == nol && button5_5.getText() == nol && button6_6.getText() == nol) ||
                (button7_7.getText() == nol && button2_2.getText() == nol && button3_3.getText() == nol
                        && button4_4.getText() == nol && button5_5.getText() == nol && button6_6.getText() == nol) ||
                (button7_7.getText() == nol && button8_8.getText() == nol && button3_3.getText() == nol
                        && button4_4.getText() == nol && button5_5.getText() == nol && button6_6.getText() == nol) ||
                (button7_7.getText() == nol && button8_8.getText() == nol && button9_9.getText() == nol
                        && button4_4.getText() == nol && button5_5.getText() == nol && button6_6.getText() == nol)
        ){
            textView.setText(R.string.pc_winner_message);
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
        }else

        if ((button6_1.getText() == nol && button5_2.getText() == nol && button4_3.getText() == nol
                && button3_4.getText() == nol && button2_5.getText() == nol && button1_6.getText() == nol) ||
                (button9_4.getText() == nol && button8_5.getText() == nol && button7_6.getText() == nol
                        && button6_7.getText() == nol && button5_8.getText() == nol && button4_9.getText() == nol) ||

                (button7_1.getText() == nol && button6_2.getText() == nol && button5_3.getText() == nol
                        && button4_4.getText() == nol && button3_5.getText() == nol && button2_6.getText() == nol) ||
                (button1_7.getText() == nol && button6_2.getText() == nol && button5_3.getText() == nol
                        && button4_4.getText() == nol && button3_5.getText() == nol && button2_6.getText() == nol) ||

                (button9_3.getText() == nol && button8_4.getText() == nol && button7_5.getText() == nol
                        && button6_6.getText() == nol && button5_7.getText() == nol && button4_8.getText() == nol) ||
                (button3_9.getText() == nol && button8_4.getText() == nol && button7_5.getText() == nol
                        && button6_6.getText() == nol && button5_7.getText() == nol && button4_8.getText() == nol) ||

                (button8_1.getText() == nol && button7_2.getText() == nol && button6_3.getText() == nol
                        && button5_4.getText() == nol && button4_5.getText() == nol && button3_6.getText() == nol) ||
                (button2_7.getText() == nol && button7_2.getText() == nol && button6_3.getText() == nol
                        && button5_4.getText() == nol && button4_5.getText() == nol && button3_6.getText() == nol) ||
                (button2_7.getText() == nol && button1_8.getText() == nol && button6_3.getText() == nol
                        && button5_4.getText() == nol && button4_5.getText() == nol && button3_6.getText() == nol) ||

                (button9_2.getText() == nol && button8_3.getText() == nol && button7_4.getText() == nol
                        && button6_5.getText() == nol && button5_6.getText() == nol && button4_7.getText() == nol) ||
                (button3_8.getText() == nol && button8_3.getText() == nol && button7_4.getText() == nol
                        && button6_5.getText() == nol && button5_6.getText() == nol && button4_7.getText() == nol) ||
                (button3_8.getText() == nol && button2_9.getText() == nol && button7_4.getText() == nol
                        && button6_5.getText() == nol && button5_6.getText() == nol && button4_7.getText() == nol) ||


                (button9_1.getText() == nol && button8_2.getText() == nol && button7_3.getText() == nol
                        && button6_4.getText() == nol && button5_5.getText() == nol && button4_6.getText() == nol) ||
                (button3_7.getText() == nol && button8_2.getText() == nol && button7_3.getText() == nol
                        && button6_4.getText() == nol && button5_5.getText() == nol && button4_6.getText() == nol) ||
                (button3_7.getText() == nol && button2_8.getText() == nol && button7_3.getText() == nol
                        && button6_4.getText() == nol && button5_5.getText() == nol && button4_6.getText() == nol) ||
                (button3_7.getText() == nol && button2_8.getText() == nol && button1_9.getText() == nol
                        && button6_4.getText() == nol && button5_5.getText() == nol && button4_6.getText() == nol)
        ){
            pointsOfPC++;
            iipoints.setText(""+pointsOfPC);
            textView.setText(R.string.pc_winner_message);

        }















    }

    private void hodPC() {
        Random random = new Random();
        random.nextInt(35);
        int buttonPcClick = 1 + random.nextInt(81);
        Log.i("hodPC","buttonPcClick - " + buttonPcClick);
        switch (buttonPcClick){
            case (1): if (button1_1.getText() == ""){
                button1_1.setText(nol); isPCWinner();

            } else{hodPC();}
            break;
            case (2): if (button1_2.getText() == ""){
                button1_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (3): if (button1_3.getText() == ""){
                button1_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (4): if (button1_4.getText() == ""){
                button1_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (5): if (button1_5.getText() == ""){
                button1_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (6): if (button1_6.getText() == ""){
                button1_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (7): if (button1_7.getText() == ""){
                button1_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (8): if (button1_8.getText() == ""){
                button1_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (9): if (button1_9.getText() == ""){
                button1_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (10): if (button2_1.getText() == ""){
                button2_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (11): if (button2_2.getText() == ""){
                button2_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (12): if (button2_3.getText() == ""){
                button2_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (13): if (button2_4.getText() == ""){
                button2_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (14): if (button2_5.getText() == ""){
                button2_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (15): if (button2_6.getText() == ""){
                button2_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (16): if (button2_7.getText() == ""){
                button2_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (17): if (button2_8.getText() == ""){
                button2_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (18): if (button2_8.getText() == ""){
                button2_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (19): if (button3_1.getText() == ""){
                button3_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (20): if (button3_2.getText() == ""){
                button3_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (21): if (button3_3.getText() == ""){
                button3_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (22): if (button3_4.getText() == ""){
                button3_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (23): if (button3_5.getText() == ""){
                button3_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (24): if (button3_6.getText() == ""){
                button3_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (25): if (button3_7.getText() == ""){
                button3_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (26): if (button3_8.getText() == ""){
                button3_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (27): if (button3_9.getText() == ""){
                button3_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;


            case (28): if (button4_1.getText() == ""){
                button4_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (29): if (button4_2.getText() == ""){
                button4_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (30): if (button4_3.getText() == ""){
                button4_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (31): if (button4_4.getText() == ""){
                button4_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (32): if (button4_5.getText() == ""){
                button4_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (33): if (button4_6.getText() == ""){
                button4_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (34): if (button4_7.getText() == ""){
                button4_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (35): if (button4_8.getText() == ""){
                button4_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (36): if (button4_9.getText() == ""){
                button4_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (37): if (button5_1.getText() == ""){
                button5_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (38): if (button5_2.getText() == ""){
                button5_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (39): if (button5_3.getText() == ""){
                button5_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (40): if (button5_4.getText() == ""){
                button5_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (41): if (button5_5.getText() == ""){
                button5_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (42): if (button5_6.getText() == ""){
                button5_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (43): if (button5_7.getText() == ""){
                button5_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (44): if (button5_8.getText() == ""){
                button5_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (45): if (button5_9.getText() == ""){
                button5_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (46): if (button6_1.getText() == ""){
                button6_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (47): if (button6_2.getText() == ""){
                button6_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (48): if (button6_3.getText() == ""){
                button6_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (49): if (button6_4.getText() == ""){
                button6_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (50): if (button6_5.getText() == ""){
                button6_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (51): if (button6_6.getText() == ""){
                button6_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (52): if (button6_7.getText() == ""){
                button6_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (53): if (button6_8.getText() == ""){
                button6_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (54): if (button6_9.getText() == ""){
                button6_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (55): if (button7_1.getText() == ""){
                button7_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (56): if (button7_2.getText() == ""){
                button7_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (57): if (button7_3.getText() == ""){
                button7_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (58): if (button7_4.getText() == ""){
                button7_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (59): if (button7_5.getText() == ""){
                button7_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (60): if (button7_6.getText() == ""){
                button7_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (61): if (button7_7.getText() == ""){
                button7_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (62): if (button7_8.getText() == ""){
                button7_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (63): if (button7_9.getText() == ""){
                button7_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (64): if (button8_1.getText() == ""){
                button8_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (65): if (button8_2.getText() == ""){
                button8_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (66): if (button8_3.getText() == ""){
                button8_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (67): if (button8_4.getText() == ""){
                button8_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (68): if (button8_5.getText() == ""){
                button8_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (69): if (button8_6.getText() == ""){
                button8_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (70): if (button8_7.getText() == ""){
                button8_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (71): if (button8_8.getText() == ""){
                button8_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (72): if (button8_9.getText() == ""){
                button8_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;

            case (73): if (button9_1.getText() == ""){
                button9_1.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (74): if (button9_2.getText() == ""){
                button9_2.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (75): if (button9_3.getText() == ""){
                button9_3.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (76): if (button9_4.getText() == ""){
                button9_4.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (77): if (button9_5.getText() == ""){
                button9_5.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (78): if (button9_6.getText() == ""){
                button9_6.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (79): if (button9_7.getText() == ""){
                button9_7.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (80): if (button9_8.getText() == ""){
                button9_8.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
            case (81): if (button9_9.getText() == ""){
                button9_9.setText(nol);isPCWinner();
            } else{hodPC();}
                break;
        }
    }
    public void clickRestart(View view){
        button1_1.setText("");
        button1_2.setText("");
        button1_3.setText("");
        button1_4.setText("");
        button1_5.setText("");
        button1_6.setText("");
        button1_7.setText("");
        button1_8.setText("");
        button1_9.setText("");
        button2_1.setText("");
        button2_2.setText("");
        button2_3.setText("");
        button2_4.setText("");
        button2_5.setText("");
        button2_6.setText("");
        button2_7.setText("");
        button2_8.setText("");
        button2_9.setText("");
        button3_1.setText("");
        button3_2.setText("");
        button3_3.setText("");
        button3_4.setText("");
        button3_5.setText("");
        button3_6.setText("");
        button3_7.setText("");
        button3_8.setText("");
        button3_9.setText("");
        button4_1.setText("");
        button4_2.setText("");
        button4_3.setText("");
        button4_4.setText("");
        button4_5.setText("");
        button4_6.setText("");
        button4_7.setText("");
        button4_8.setText("");
        button4_9.setText("");
        button5_1.setText("");
        button5_2.setText("");
        button5_3.setText("");
        button5_4.setText("");
        button5_5.setText("");
        button5_6.setText("");
        button5_7.setText("");
        button5_8.setText("");
        button5_9.setText("");
        button6_1.setText("");
        button6_2.setText("");
        button6_3.setText("");
        button6_4.setText("");
        button6_5.setText("");
        button6_6.setText("");
        button6_7.setText("");
        button6_8.setText("");
        button6_9.setText("");
        button7_1.setText("");
        button7_2.setText("");
        button7_3.setText("");
        button7_4.setText("");
        button7_5.setText("");
        button7_6.setText("");
        button7_7.setText("");
        button7_8.setText("");
        button7_9.setText("");
        button8_1.setText("");
        button8_2.setText("");
        button8_3.setText("");
        button8_4.setText("");
        button8_5.setText("");
        button8_6.setText("");
        button8_7.setText("");
        button8_8.setText("");
        button8_9.setText("");
        button9_1.setText("");
        button9_2.setText("");
        button9_3.setText("");
        button9_4.setText("");
        button9_5.setText("");
        button9_6.setText("");
        button9_7.setText("");
        button9_8.setText("");
        button9_9.setText("");
        textView.setText("");

    }
}
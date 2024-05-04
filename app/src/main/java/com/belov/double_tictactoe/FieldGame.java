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
    Button button1_1, button1_2, button1_3, button1_4, button1_5, button1_6,
            button2_1, button2_2, button2_3, button2_4, button2_5, button2_6,
            button3_1, button3_2, button3_3, button3_4, button3_5, button3_6,
            button4_1, button4_2, button4_3, button4_4, button4_5, button4_6,
            button5_1, button5_2, button5_3, button5_4, button5_5, button5_6,
            button6_1, button6_2, button6_3, button6_4, button6_5, button6_6;

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
        button2_1 = findViewById(R.id.button2_1);
        button2_2 = findViewById(R.id.button2_2);
        button2_3 = findViewById(R.id.button2_3);
        button2_4 = findViewById(R.id.button2_4);
        button2_5 = findViewById(R.id.button2_5);
        button2_6 = findViewById(R.id.button2_6);
        button3_1 = findViewById(R.id.button3_1);
        button3_2 = findViewById(R.id.button3_2);
        button3_3 = findViewById(R.id.button3_3);
        button3_4 = findViewById(R.id.button3_4);
        button3_5 = findViewById(R.id.button3_5);
        button3_6 = findViewById(R.id.button3_6);
        button4_1 = findViewById(R.id.button4_1);
        button4_2 = findViewById(R.id.button4_2);
        button4_3 = findViewById(R.id.button4_3);
        button4_4 = findViewById(R.id.button4_4);
        button4_5 = findViewById(R.id.button4_5);
        button4_6 = findViewById(R.id.button4_6);
        button5_1 = findViewById(R.id.button5_1);
        button5_2 = findViewById(R.id.button5_2);
        button5_3 = findViewById(R.id.button5_3);
        button5_4 = findViewById(R.id.button5_4);
        button5_5 = findViewById(R.id.button5_5);
        button5_6 = findViewById(R.id.button5_6);
        button6_1 = findViewById(R.id.button6_1);
        button6_2 = findViewById(R.id.button6_2);
        button6_3 = findViewById(R.id.button6_3);
        button6_4 = findViewById(R.id.button6_4);
        button6_5 = findViewById(R.id.button6_5);
        button6_6 = findViewById(R.id.button6_6);

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

    public void isPlayerWinner () {
        if (button1_1.getText() == krestt && button1_2.getText() == krestt && button1_3.getText() == krestt
                && button1_4.getText() == krestt && button1_5.getText() == krestt  && button1_6.getText() == krestt ) {
            textView.setText("Поздравляем с победой");
        }
    }

}
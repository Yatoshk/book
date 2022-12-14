package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class Theme3Activity extends AppCompatActivity {

    int questDone = 0;//10
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme3);
    }
    public void onClickCheck3(View view) {
        //проверка ответов
        Switch sw = findViewById(R.id.switch1);

        EditText e1 = findViewById(R.id.e1);
        EditText e2 = findViewById(R.id.e2);
        EditText e3 = findViewById(R.id.e3);
        EditText e4 = findViewById(R.id.e4);
        EditText e5 = findViewById(R.id.e5);
        EditText e6 = findViewById(R.id.e6);
        EditText e7 = findViewById(R.id.e7);
        EditText e8 = findViewById(R.id.e8);
        EditText e9 = findViewById(R.id.e9);
        checkText(e1, "1");
        checkText(e2, "0");
        checkText(e3, "1");
        checkText(e4, "1");
        checkText(e5, "1");
        checkText(e6, "0");
        checkText(e7, "0");
        checkText(e8, "1");
        checkText(e9, "0");
        if (sw.isChecked()) {
            sw.setBackgroundColor(Color.GREEN);
            questDone++;
        } else
            sw.setBackgroundColor(Color.RED);

        if(questDone == 10)
            MainActivity.saveProgress((MainActivity.loadProgress())+1);
    }
    private void checkText(EditText e, String t)
    {
        if (e.getText().toString().equals(t)){
            e.setBackgroundColor(Color.GREEN);
            questDone++;
        }else
            e.setBackgroundColor(Color.RED);
    }
}
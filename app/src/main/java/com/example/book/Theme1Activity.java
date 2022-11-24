package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Theme1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme1);
    }

    public void onClickCheck1(View view) {
        //проверка ответов

        EditText editText1 = findViewById(R.id.editTextTextPersonName);
        RadioButton rb1 = findViewById(R.id.radioButton);
        RadioButton rb2 = findViewById(R.id.radioButton2);
        RadioButton rb3 = findViewById(R.id.radioButton3);
        RadioGroup radioGroup = findViewById(R.id.rg);
        int id = radioGroup.getCheckedRadioButtonId();
        String text1 = editText1.getText().toString();


        if (text1.length() != 3 || text1.charAt(1)==text1.charAt(2))
            editText1.setBackgroundColor(Color.RED);
        else if (Character.isUpperCase(text1.charAt(0)) && Character.isLowerCase(text1.charAt(1)) &&
                Character.isLowerCase(text1.charAt(2)))
            editText1.setBackgroundColor(Color.GREEN);
/*
        if (id == 0)
            rb1.setBackgroundColor(Color.GREEN);
        else if (id == 1)
            rb2.setBackgroundColor(Color.RED);
        else if (id == 2)
            rb3.setBackgroundColor(Color.RED);*/

        switch (id) {
            case R.id.radioButton:
                rb1.setBackgroundColor(Color.RED);
                rb2.setBackgroundColor(Color.TRANSPARENT);
                rb3.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton2:
                rb2.setBackgroundColor(Color.RED);
                rb1.setBackgroundColor(Color.TRANSPARENT);
                rb3.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton3:
                rb3.setBackgroundColor(Color.GREEN);
                rb2.setBackgroundColor(Color.TRANSPARENT);
                rb1.setBackgroundColor(Color.TRANSPARENT);
                break;
            default:
                break;
        }
    }
    /*View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioButton rb = (RadioButton)v;
            switch (rb.getId()) {
                case R.id.radioButton:
                case R.id.radioButton2:
                    rb.setBackgroundColor(Color.GREEN);
                    break;
                case R.id.radioButton3: rb.setBackgroundColor(Color.RED);
                    break;
                default:
                    break;
            }
        }
    };*/
}

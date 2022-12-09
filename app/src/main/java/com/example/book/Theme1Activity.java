package com.example.book;

import static java.lang.Math.round;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
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
        MainActivity.saves = getSharedPreferences(MainActivity.FILE_NAME, MODE_PRIVATE);
        //ProgressBar pb = findViewById(R.id.progressBar);
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
        {
            editText1.setBackgroundColor(Color.GREEN);
            MainActivity.saveProgress((MainActivity.loadProgress())+1);
            //pb.incrementProgressBy(1);
        }

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
                MainActivity.saveProgress((MainActivity.loadProgress())+1);
                //pb.incrementProgressBy(1);
                break;
            default:
                break;
        }
    }

}

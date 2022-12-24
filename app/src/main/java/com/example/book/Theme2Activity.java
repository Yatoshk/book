package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Theme2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme2);
    }

    public void onClickCheck2(View view) {
        //проверка ответов

        RadioButton rb4= findViewById(R.id.radioButton4);
        RadioButton rb5= findViewById(R.id.radioButton5);
        RadioButton rb6= findViewById(R.id.radioButton6);
        RadioButton rb7= findViewById(R.id.radioButton7);
        RadioButton rb8= findViewById(R.id.radioButton8);
        RadioButton rb9= findViewById(R.id.radioButton9);
        RadioButton rb10= findViewById(R.id.radioButton10);
        RadioButton rb11= findViewById(R.id.radioButton11);
        RadioButton rb12= findViewById(R.id.radioButton12);
        RadioButton rb13= findViewById(R.id.radioButton13);
        RadioButton rb14= findViewById(R.id.radioButton14);
        RadioButton rb15= findViewById(R.id.radioButton15);
        RadioButton rb16= findViewById(R.id.radioButton16);
        RadioButton rb17= findViewById(R.id.radioButton17);
        RadioButton rb18= findViewById(R.id.radioButton18);
        RadioButton rb19= findViewById(R.id.radioButton19);
        RadioButton rb20= findViewById(R.id.radioButton20);
        RadioButton rb21= findViewById(R.id.radioButton21);
        RadioButton rb22= findViewById(R.id.radioButton22);
        RadioButton rb23= findViewById(R.id.radioButton23);
        RadioButton rb24= findViewById(R.id.radioButton24);
        RadioButton rb25= findViewById(R.id.radioButton25);

        RadioGroup radioGroup1 = findViewById(R.id.rg1);
        int id1 = radioGroup1.getCheckedRadioButtonId();

        RadioGroup radioGroup2 = findViewById(R.id.rg2);
        int id2 = radioGroup2.getCheckedRadioButtonId();

        RadioGroup radioGroup3 = findViewById(R.id.rg3);
        int id3 = radioGroup3.getCheckedRadioButtonId();

        RadioGroup radioGroup4 = findViewById(R.id.rg4);
        int id4 = radioGroup4.getCheckedRadioButtonId();

        RadioGroup radioGroup5 = findViewById(R.id.rg5);
        int id5= radioGroup5.getCheckedRadioButtonId();

        RadioGroup radioGroup6 = findViewById(R.id.rg6);
        int id6 = radioGroup6.getCheckedRadioButtonId();

        switch (id1) {
            case R.id.radioButton4:
                rb4.setBackgroundColor(Color.GREEN);
                rb5.setBackgroundColor(Color.TRANSPARENT);
                rb6.setBackgroundColor(Color.TRANSPARENT);
                rb7.setBackgroundColor(Color.TRANSPARENT);
                rb8.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("3 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "3 ");
                }
                break;
            case R.id.radioButton5:
                rb4.setBackgroundColor(Color.TRANSPARENT);
                rb5.setBackgroundColor(Color.GREEN);
                rb6.setBackgroundColor(Color.TRANSPARENT);
                rb7.setBackgroundColor(Color.TRANSPARENT);
                rb8.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("3 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "3 ");
                }
                break;
            case R.id.radioButton6:
                rb4.setBackgroundColor(Color.TRANSPARENT);
                rb5.setBackgroundColor(Color.TRANSPARENT);
                rb6.setBackgroundColor(Color.RED);
                rb7.setBackgroundColor(Color.TRANSPARENT);
                rb8.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton7:
                rb4.setBackgroundColor(Color.TRANSPARENT);
                rb5.setBackgroundColor(Color.TRANSPARENT);
                rb6.setBackgroundColor(Color.TRANSPARENT);
                rb7.setBackgroundColor(Color.RED);
                rb8.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton8:
                rb4.setBackgroundColor(Color.TRANSPARENT);
                rb5.setBackgroundColor(Color.TRANSPARENT);
                rb6.setBackgroundColor(Color.TRANSPARENT);
                rb7.setBackgroundColor(Color.TRANSPARENT);
                rb8.setBackgroundColor(Color.RED);
                break;
            default:
                break;
        }

        switch (id2) {
            case R.id.radioButton9:
                rb9.setBackgroundColor(Color.GREEN);
                rb10.setBackgroundColor(Color.TRANSPARENT);
                rb11.setBackgroundColor(Color.TRANSPARENT);
                rb12.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("4 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "4 ");
                }
                break;
            case R.id.radioButton10:
                rb9.setBackgroundColor(Color.TRANSPARENT);
                rb10.setBackgroundColor(Color.RED);
                rb11.setBackgroundColor(Color.TRANSPARENT);
                rb12.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton11:
                rb9.setBackgroundColor(Color.TRANSPARENT);
                rb10.setBackgroundColor(Color.TRANSPARENT);
                rb11.setBackgroundColor(Color.RED);
                rb12.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton12:
                rb9.setBackgroundColor(Color.TRANSPARENT);
                rb10.setBackgroundColor(Color.TRANSPARENT);
                rb11.setBackgroundColor(Color.TRANSPARENT);
                rb12.setBackgroundColor(Color.RED);
                break;
            default:
                break;
        }

        switch (id3) {
            case R.id.radioButton13:
                rb13.setBackgroundColor(Color.GREEN);
                rb14.setBackgroundColor(Color.TRANSPARENT);
                rb15.setBackgroundColor(Color.TRANSPARENT);
                rb16.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("5 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "5 ");
                }
                break;
            case R.id.radioButton14:
                rb13.setBackgroundColor(Color.TRANSPARENT);
                rb14.setBackgroundColor(Color.GREEN);
                rb15.setBackgroundColor(Color.TRANSPARENT);
                rb16.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("5 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "5 ");
                }
                break;
            case R.id.radioButton15:
                rb13.setBackgroundColor(Color.TRANSPARENT);
                rb14.setBackgroundColor(Color.TRANSPARENT);
                rb15.setBackgroundColor(Color.RED);
                rb16.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton16:
                rb13.setBackgroundColor(Color.TRANSPARENT);
                rb14.setBackgroundColor(Color.TRANSPARENT);
                rb15.setBackgroundColor(Color.TRANSPARENT);
                rb16.setBackgroundColor(Color.RED);
                break;
            default:
                break;
        }

        switch (id4) {
            case R.id.radioButton17:
                rb17.setBackgroundColor(Color.GREEN);
                rb18.setBackgroundColor(Color.TRANSPARENT);
                rb19.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("6 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "6 ");
                }
                break;
            case R.id.radioButton18:
                rb17.setBackgroundColor(Color.TRANSPARENT);
                rb18.setBackgroundColor(Color.GREEN);
                rb19.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("6 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "6 ");
                }
                break;
            case R.id.radioButton19:
                rb17.setBackgroundColor(Color.TRANSPARENT);
                rb18.setBackgroundColor(Color.TRANSPARENT);
                rb19.setBackgroundColor(Color.RED);
                break;
            default:
                break;
        }
        switch (id5) {
            case R.id.radioButton20:
                rb20.setBackgroundColor(Color.RED);
                rb21.setBackgroundColor(Color.TRANSPARENT);
                rb22.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton21:
                rb20.setBackgroundColor(Color.TRANSPARENT);
                rb21.setBackgroundColor(Color.GREEN);
                rb22.setBackgroundColor(Color.TRANSPARENT);
                if (!((MainActivity.loadQuests()).contains("7 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress())+1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "7 ");
                }
                break;
            case R.id.radioButton22:
                rb20.setBackgroundColor(Color.TRANSPARENT);
                rb21.setBackgroundColor(Color.TRANSPARENT);
                rb22.setBackgroundColor(Color.RED);
                break;
            default:
                break;
        }
        switch (id6) {
            case R.id.radioButton23:
                rb23.setBackgroundColor(Color.RED);
                rb24.setBackgroundColor(Color.TRANSPARENT);
                rb25.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton24:
                rb23.setBackgroundColor(Color.TRANSPARENT);
                rb24.setBackgroundColor(Color.RED);
                rb25.setBackgroundColor(Color.TRANSPARENT);
                break;
            case R.id.radioButton25:
                rb23.setBackgroundColor(Color.TRANSPARENT);
                rb24.setBackgroundColor(Color.TRANSPARENT);
                rb25.setBackgroundColor(Color.GREEN);
                if (!((MainActivity.loadQuests()).contains("8 "))){
                    MainActivity.saveProgress((MainActivity.loadProgress()) + 1);
                    MainActivity.saveQuest(MainActivity.loadQuests() + "8 ");
                }
                break;
            default:
                break;
        }
    }
}
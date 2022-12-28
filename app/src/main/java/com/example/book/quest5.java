package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class quest5 extends AppCompatActivity {
    int questDone = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest5);
        Button b1 = findViewById(R.id.b11111);
        Button b2 = findViewById(R.id.b22222);
        Button b3 = findViewById(R.id.res5);
        if (MainActivity.genForDaily.list.size() == 5)
        {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        }
    }

    public void next5(View view) {
        returnClass(MainActivity.genForDaily.qenNumber());
    }

    public void return5(View view) {
        MainActivity.genForDaily.list.clear();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
    public void returnClass(int n){
        Intent intent = null;
        switch (n)
        {
            case 1:
                intent = new Intent(this, quest1.class);
                break;
            case 2:
                intent = new Intent(this, quest2.class);
                break;
            case 3:
                intent = new Intent(this, quest3.class);
                break;
            case 4:
                intent = new Intent(this, quest4.class);
                break;
            case 5:
                intent = new Intent(this, quest5.class);
                break;
        }
        startActivity(intent);
    }
    public void res5(View view) {

        Button b1 = findViewById(R.id.b11111);
        b1.setVisibility(View.VISIBLE);
        boolean flag = false;
        EditText e1 = findViewById(R.id.te1);
        EditText e2 = findViewById(R.id.te2);
        EditText e3 = findViewById(R.id.te3);
        EditText e4 = findViewById(R.id.te4);
        EditText e5 = findViewById(R.id.te5);
        EditText e6 = findViewById(R.id.te6);
        EditText e7 = findViewById(R.id.te7);
        EditText e8 = findViewById(R.id.te8);
        Switch sw = findViewById(R.id.switch2);
        checkText(e1, "1");
        checkText(e2, "0");
        checkText(e3, "1");
        checkText(e4, "1");
        checkText(e5, "1");
        checkText(e6, "1");
        checkText(e7, "1");
        checkText(e8, "1");
        if (!sw.isChecked())
            questDone++;
        if (questDone == 9)
        {
            flag = true;
            MainActivity.dailyCount++;
        }

        TextView about = findViewById(R.id.textRes5);
        if(flag)
            about.setText("Верно");
        else
            about.setText("Неверно");
        if (MainActivity.genForDaily.list.size() == 5)
        {
            if(flag)
                about.setText("Верно \n" + MainActivity.dailyCount + "/5");
            else
                about.setText("Неверно\n" + MainActivity.dailyCount + "/5");
        }
    }

    private void checkText(EditText e, String t)
    {
        if (e.getText().toString().equals(t))
            questDone++;
    }
}
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

public class quest2 extends AppCompatActivity {
    int questDone = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest2);
        Button b1 = findViewById(R.id.b11);
        Button b2 = findViewById(R.id.b22);

        Button b3 = findViewById(R.id.res2);
        if (MainActivity.genForDaily.list.size() == 5)
        {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        }
    }
    public void next2(View view) {
        returnClass(MainActivity.genForDaily.qenNumber());
    }

    public void return2(View view) {
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
    public void res2(View view) {
        Button b1 = findViewById(R.id.b11);
        b1.setVisibility(View.VISIBLE);

        RadioGroup rg2 = findViewById(R.id.rgp2);
        int id2 = rg2.getCheckedRadioButtonId();

        boolean flag = false;

        switch (id2) {
            case R.id.rb6:
                flag = true;
                MainActivity.dailyCount++;
                break;
        }


        TextView about = findViewById(R.id.textRes2);
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
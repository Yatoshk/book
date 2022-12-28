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

public class quest4 extends AppCompatActivity {
    int questDone = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest4);
        Button b1 = findViewById(R.id.b1111);
        Button b2 = findViewById(R.id.b2222);
        Button b3 = findViewById(R.id.res4);
        if (MainActivity.genForDaily.list.size() == 5)
        {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
        }
    }
    public void next4(View view) {
        returnClass(MainActivity.genForDaily.qenNumber());
    }

    public void return4(View view) {
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
    public void res4(View view) {
        Button b1 = findViewById(R.id.b1111);
        b1.setVisibility(View.VISIBLE);

        RadioGroup rg4 = findViewById(R.id.rgp4);
        int id4 = rg4.getCheckedRadioButtonId();

        boolean flag = false;

        switch (id4) {
            case R.id.rb15:
                flag = true;
                MainActivity.dailyCount++;
                break;
        }


        TextView about = findViewById(R.id.textRes4);
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
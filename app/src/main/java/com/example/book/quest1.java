package com.example.book;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class quest1 extends AppCompatActivity {
    int questDone = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest1);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        if (MainActivity.genForDaily.list.size() == 5)
        {
            b1.setVisibility(View.INVISIBLE);
            b2.setVisibility(View.VISIBLE);
        }
    }

    public void next1(View view) {

        returnClass(MainActivity.genForDaily.qenNumber());
    }

    public void return1(View view) {
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

    public void res1(View view) {

        Button b1 = findViewById(R.id.b1);
        b1.setVisibility(View.VISIBLE);

        boolean flag = false;

        RadioGroup rg1 = findViewById(R.id.rgp1);
        int id1 = rg1.getCheckedRadioButtonId();

        switch (id1) {
            case R.id.rb2:
                flag = true;
                MainActivity.dailyCount++;
                break;
        }
        TextView about = findViewById(R.id.textRes1);
        if(flag)
            about.setText("??????????");
        else
            about.setText("??????????????");
        if (MainActivity.genForDaily.list.size() == 5)
        {
            if(flag)
                about.setText("?????????? \n" + MainActivity.dailyCount + "/5");
            else
                about.setText("??????????????\n" + MainActivity.dailyCount + "/5");
        }

    }

    private void checkText(EditText e, String t)
    {
        if (e.getText().toString().equals(t))
            questDone++;
    }

}
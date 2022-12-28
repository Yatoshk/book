package com.example.book;

import static java.lang.Math.round;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.book.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public final static String FILE_NAME = "content.txt";
    public final static String SAVES_NAME = "saves.txt";
    public static SharedPreferences saves;
    public static SharedPreferences quests;
    public static DailyQuests genForDaily = new DailyQuests();
    public static int dailyCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.book.databinding.ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);



        saves = getSharedPreferences(FILE_NAME, MODE_PRIVATE);
        quests = getSharedPreferences(SAVES_NAME, MODE_PRIVATE);



    }


    public void onClick1(View view) {
        Intent intent = new Intent(this, Theme1Activity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, Theme2Activity.class);
        startActivity(intent);
    }

    public void onClick3(View view) {
        Intent intent = new Intent(this, Theme3Activity.class);
        startActivity(intent);
    }

    public void daily(View view) {
        if(!genForDaily.flag)
        {
            returnClass(genForDaily.qenNumber());
            genForDaily.flag = true;
        }
        else
        {
            Context context = getApplicationContext();
            CharSequence text = "Ежедневные задание пройдены";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

    }

    public void check(View view) {
        ProgressBar pb = findViewById(R.id.progressBar);
        TextView text = findViewById(R.id.textView8);
        float p = (float)loadProgress()/9;
        text.setText("Ваш прогресс " + round(p * 100) + "%");
        pb.setProgress(round(p * 100));
    }
    public void check1(View view) {
        TextView about = findViewById(R.id.textView12);
        Button bh = findViewById(R.id.check);
        Button bv = findViewById(R.id.check5);
        bh.setVisibility(View.VISIBLE);
        bv.setVisibility(View.INVISIBLE);
        about.setText("Приложение разработали: Чесалова Надежда, Райден Роман, Репкин Денис, Закиров Тимур - студенты Ульяновского государственного университета группы МОАИС-21/1");
    }
    public void check2(View view) {
        TextView about = findViewById(R.id.textView12);
        Button bh = findViewById(R.id.check);
        Button bv = findViewById(R.id.check5);
        bh.setVisibility(View.INVISIBLE);
        bv.setVisibility(View.VISIBLE);
        about.setText("");

    }
/*
    public void reload(View view) {
        saveProgress(0);
    }
    public void reload1(View view) {
        saveQuest("");
    }*/
    ////

    public static void saveQuest(String n) {

        SharedPreferences.Editor editor1 = quests.edit();
        editor1.putString(SAVES_NAME, n);
        editor1.apply();

    }

    public static String loadQuests() {
        String n = quests.getString(SAVES_NAME, "");
        return n;
    }
//////////
    public static void saveProgress(int n) {

        SharedPreferences.Editor editor = saves.edit();
        editor.putInt(FILE_NAME, n);
        editor.apply();

    }

    public static int loadProgress() {
        int n = saves.getInt(FILE_NAME, 0);
        return n;
    }
////////////////
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
}
package com.example.book;

import static java.lang.Math.round;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.book.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public final static String FILE_NAME = "content.txt";
    public static SharedPreferences saves;



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

        saves = getSharedPreferences(MainActivity.FILE_NAME, MODE_PRIVATE);
        ProgressBar pb = findViewById(R.id.progressBar);

        float p = (float)loadProgress()/8;
        pb.setProgress(round(p * 100));
    }

    public void onClick1(View view) {
        Intent intent = new Intent(this, Theme1Activity.class);
        startActivity(intent);
    }

    public void onClick2(View view) {
        Intent intent = new Intent(this, Theme2Activity.class);
        startActivity(intent);
    }

    ////

    public static void saveProgress(int n) {

        SharedPreferences.Editor editor = saves.edit();
        editor.putInt(FILE_NAME, n);
        editor.apply();

    }

    public static int loadProgress() {
        int n = saves.getInt(FILE_NAME, 0);
        return n;
    }

}
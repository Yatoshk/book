package com.example.book;

import static java.lang.Math.round;

import android.content.Intent;
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
    //данные о выполненных заданиях должны обновляться(когда), инфа о класс должен быть виден во всех классах(нужно добавить файл сохраняющий данные)
    //
    private final SaveProgress saveProgress = new SaveProgress(1);
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

        ProgressBar progressBar = findViewById(R.id.progressBar);
        float p = (float)saveProgress.questSuccesses/saveProgress.getAllQuestCount();
        progressBar.setProgress(round(p * 100));
    }
    public void onClick1(View view) {
        Intent intent = new Intent(this, Theme1Activity.class);
        startActivity(intent);
    }

}
package com.example.book;

import static android.content.Context.MODE_PRIVATE;

import static java.lang.Math.round;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SaveProgress {
    private final static String FILE_NAME = "content.txt";
    private SharedPreferences saves;

    private final int allQuest = 5;

    public int questSuccesses;

    public int getAllQuest() {
        return allQuest;
    }

    public void setProgressBar(ProgressBar pb){
        float p = (float)this.questSuccesses/this.getAllQuest();
        pb.setProgress(round(p * 100));
    }
    //сохранение прогресса
    public void saveProgress(int n){

    }
    // открытие файла
    public void OpenProgress(){

    }
}

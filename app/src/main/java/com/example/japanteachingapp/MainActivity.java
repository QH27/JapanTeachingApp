package com.example.japanteachingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_black, btn_green, btn_red, btn_yellow, btn_purple;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_black = findViewById(R.id.btn_black);
        btn_green = findViewById(R.id.btn_green);
        btn_red = findViewById(R.id.btn_red);
        btn_yellow = findViewById(R.id.btn_yellow);
        btn_purple = findViewById(R.id.btn_purple);

        btn_black.setOnClickListener(this);
        btn_purple.setOnClickListener(this);
        btn_yellow.setOnClickListener(this);
        btn_red.setOnClickListener(this);
        btn_green.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //Find the button by id and play the correct sound
        int idBtn = v.getId();
        if(idBtn == R.id.btn_black){
            playSound(R.raw.black);
        } else if (idBtn == R.id.btn_green) {
            playSound(R.raw.green);
        } else if (idBtn == R.id.btn_red) {
            playSound(R.raw.red);
        } else if (idBtn == R.id.btn_yellow){
            playSound(R.raw.yellow);
        } else if (idBtn == R.id.btn_purple) {
            playSound(R.raw.purple);
        }
    }
    public void playSound(int id){
        MediaPlayer mediaPlayer = MediaPlayer.create(this, id);
        mediaPlayer.start();
    }
}
package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button button;
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.dice1);
        img2 = findViewById(R.id.dice2);
        button = findViewById(R.id.btn);

        final int[] diceImages = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,};
        //this final mp is made to store mp3 file, which can be played later.
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice_sound);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Dice Rolled!", Toast.LENGTH_SHORT).show();
                Random rndObject = new Random();
                int myRandomNumber = rndObject.nextInt(6);
                img1.setImageResource(diceImages[myRandomNumber]);
                myRandomNumber = rndObject.nextInt(6);
                img2.setImageResource(diceImages[myRandomNumber]);
                mp.start();
            }
        });
    }
}
package com.example.gallusawa.zooproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class DetailsActivity extends AppCompatActivity {


    TextView animalName;
    TextView animalCategory;
    TextView animalFood;
    TextView animalHabitat;
    ImageView imageView;
    TextView textView;


    Button play, pause, stop, button;
    ArrayList<Zoo> z = new ArrayList<>();
    int animalId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        Intent intent = getIntent();
        Zoo animal = (Zoo) intent.getSerializableExtra("Animal");



        animalName= (TextView) findViewById(R.id.AnimalName);
        animalCategory = (TextView) findViewById(R.id.AnimalCategory);
        animalFood = (TextView) findViewById(R.id.AnimalFood);
        animalHabitat = (TextView) findViewById(R.id.AnimalHabitat);
        imageView = (ImageView) findViewById(R.id.imageView);

        button = (Button) findViewById(R.id.btnButtom4);


        animalName.setText(animal.getAnimalName().toString());
        animalCategory.setText(animal.getAnimalCategory().toString());
        animalFood.setText(animal.getAnimalFood().toString());
        animalHabitat.setText(animal.getAnimalHabitat().toString());
    }


/*

        play = (Button) findViewById(R.id.btnButtom1);
        pause = (Button) findViewById(R.id.btnButtom2);
        stop = (Button) findViewById(R.id.btnButtom3);

        final MediaPlayer sound = MediaPlayer.create(getActivity(), R.raw.lion);
        play.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                sound.setLooping(true);
                sound.start();
            }

        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (sound.isPlaying()) {
                    sound.pause();
                    sound.release();
                }

            }

        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                if (sound.isPlaying()) {
                    sound.stop();
                }

            }

        });

*/
    }


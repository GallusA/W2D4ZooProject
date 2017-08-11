package com.example.gallusawa.zooproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AnimalsActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView textView;
    RecyclerView rvZooList;

    RecyclerView.LayoutManager layoutManager;
    RecyclerView.ItemAnimator itemAnimator;

    ZooListAdaptor zooListAdaptor;

    List<Zoo> zooList = new ArrayList<>();


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animals_activity);


        Intent i = getIntent();
        String animalId = i.getStringExtra("Animal");
        Log.d(TAG, "onCreate: " + animalId);



        rvZooList = (RecyclerView) findViewById(R.id.rvZooList);
        layoutManager = new LinearLayoutManager(this);
        itemAnimator = new DefaultItemAnimator();
        rvZooList.setLayoutManager(layoutManager);
        rvZooList.setItemAnimator(itemAnimator);


        zooListAdaptor =  new ZooListAdaptor(zooList);
        rvZooList.setAdapter(zooListAdaptor);

        initzooList(animalId);
        zooListAdaptor.notifyDataSetChanged();

     //   Intent intent = new Intent(this, Main4Activity.class);
      //  intent.putExtra("Animal", "keys");
     //   startActivity(intent);


    }



    private void initzooList(String animalId) {
        ArrayList<Zoo> z = new ArrayList<>();
        z.add(new Zoo("Lion", "Mammals", "Carnivora", "Savana"));
        z.add(new Zoo("bald eagle", "Birds", "Carnivora", "Forest"));
        z.add(new Zoo("whale shark", "Fish", "Herbivora", "Tropical Ocean"));
        z.add(new Zoo("American alligators", "Reptiles", "Carnivora", "Tropical Land"));
        z.add(new Zoo("elephant", "Mammals", "Herbivora", "Forest"));
        z.add(new Zoo("black hawk", "Birds", "Herbivora", "Nord America"));
        z.add(new Zoo("Blackfin Tuna", "Fish", "Herbivora", "Tropical region"));
        z.add(new Zoo("African crocodile", "Reptiles", "carnivora", "Tropical region"));
        z.add(new Zoo("Mosquito", "Insects", "Herbivora", "Tropical region"));
        z.add(new Zoo("American Ants", "Insects", "Herbivora", "American soil"));

        ArrayList<Zoo> z2 = new ArrayList<>();
        z2.add(new Zoo("Lion", "", "", ""));
        z2.add(new Zoo("bald eagle", "", "", ""));
        z2.add(new Zoo("whale shark", "", "", ""));
        z2.add(new Zoo("American alligators", "", "", ""));
        z2.add(new Zoo("elephant", "", "", ""));
        z2.add(new Zoo("black hawk", "", "", ""));
        z2.add(new Zoo("Blackfin Tuna", "", "", ""));
        z2.add(new Zoo("African crocodile", "", "", ""));
        z2.add(new Zoo("Mosquito", "", "", ""));
        z2.add(new Zoo("American Ants", "", "", ""));


        for(int i=0;i<z2.size();i++)
            if(z.get(i).getAnimalCategory().equals(animalId))
                zooList.add(z2.get(i));
        /*
        for(int i=0;i<z.size();i++)
            if(z.get(i).getAnimalCategory().equals(animalId))
                zooList.add(z.get(i));*/
    }

  /*  public void saveContact(View view) {

        MyAnimal contact = new MyAnimal(AnimalName.getText().toString(), AnimalCategory.getText().toString(); AnimalFood.getText().toString(), AnimalHabitat.getText().toString();
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        databaseHelper.saveNewAnimal(contact);


    }

    public void displayContact(View view) {
        DatabaseHelper databaseHelper = new DatabaseHelper(this);
        List<MyAnimal> animals = databaseHelper.getAnimals();

        for (MyAnimal contact : animals) {
            Log.d(TAG, "displayContact: " + contact.getAnimalName() + " " contact.getAnimalCategory() + "" + contact.getAnimalFood() + "" + contact.getAnimalHabitat() );
        }
    }*/
}

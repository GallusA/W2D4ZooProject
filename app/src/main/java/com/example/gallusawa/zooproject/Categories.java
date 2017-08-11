package com.example.gallusawa.zooproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Categories extends Activity implements AdapterView.OnItemClickListener {



  ListView animalCategory;


    private static final String TAG = "Second";

    private  String[] animalString = {"Birds", "Mammals", "Reptiles", "Fish", "Insects"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categories);

        animalCategory = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> animal = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,animalString);

        animalCategory.setAdapter(animal);
        animalCategory.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
     //   Toast.makeText(Categories.this, "It works", Toast.LENGTH_SHORT).show();
         Intent i = new Intent(this, AnimalsActivity.class);
        i.putExtra("Animal", ""+animalString[position]);
        startActivity(i);
    }

    public class EXTRA_MESSAGE {
    }
}

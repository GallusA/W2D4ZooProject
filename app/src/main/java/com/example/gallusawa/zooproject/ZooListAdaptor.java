package com.example.gallusawa.zooproject;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by gallusawa on 8/10/17.
 */

public class ZooListAdaptor extends RecyclerView.Adapter<ZooListAdaptor.ViewHolder>{

    List<Zoo> zooList = new ArrayList<>();

    public ZooListAdaptor(List<Zoo> foodList) {
        this.zooList = foodList;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView animalName;
        TextView animalGategory;
        TextView animalFood;
        TextView animalHabitat;


        public ViewHolder(View itemView) {
            super(itemView);

            animalName = (TextView) itemView.findViewById(R.id.AnimalName);
            animalGategory = (TextView) itemView.findViewById(R.id.AnimalCategory);
            animalFood = (TextView) itemView.findViewById(R.id.AnimalFood);
            animalHabitat = (TextView) itemView.findViewById(R.id.AnimalHabitat);

        }


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.zoolist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: ");
        final int p=position;
        final Zoo zoo = zooList.get(position);
        holder.animalName.setText(zoo.getAnimalName());
        holder.animalGategory.setText(zoo.getAnimalCategory());
        holder.animalFood.setText(zoo.getAnimalFood());
        holder.animalHabitat.setText(zoo.getAnimalHabitat());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                Intent i = new Intent(v.getContext(), DetailsActivity.class);
                Zoo z2 = null;
                for(int x=0;x<z.size();x++)
                    if(zoo.getAnimalName().equals(z.get(x).getAnimalName()))
                        z2 = z.get(x);
                i.putExtra("Animal", z2);
                v.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return zooList.size();
    }


}

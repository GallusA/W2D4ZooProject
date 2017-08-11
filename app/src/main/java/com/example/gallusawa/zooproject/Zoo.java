package com.example.gallusawa.zooproject;

import java.io.Serializable;

/**
 * Created by gallusawa on 8/10/17.
 */

public class Zoo implements Serializable {

    String animalName;
    String animalCategory;
    String animalFood;
   String animalHabitat;

    public Zoo(String animalName, String animalCategory, String animalFood, String animalHabitat) {
        this.animalName = animalName;
        this.animalCategory = animalCategory;
        this.animalFood = animalFood;
        this.animalHabitat = animalHabitat;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalCategory() {
        return animalCategory;
    }

    public void setAnimalCategory(String animalCategory) {
        this.animalCategory = animalCategory;
    }

    public String getAnimalFood() {
        return animalFood;
    }

    public void setAnimalFood(String animalFood) {
        this.animalFood = animalFood;
    }

    public String getAnimalHabitat() {
        return animalHabitat;
    }

    public void setAnimalHabitat(String animalHabitat) {
        this.animalHabitat = animalHabitat;
    }
}

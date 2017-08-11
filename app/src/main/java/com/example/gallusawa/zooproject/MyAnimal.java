package com.example.gallusawa.zooproject;

import java.io.Serializable;

/**
 * Created by gallusawa on 8/10/17.
 */

public class MyAnimal implements Serializable {

    String AnimalName;
    String AnimalCategory;
    String AnimalFood;
    String AnimalHabitat;

    public MyAnimal(String animalName, String animalCategory, String animalFood, String animalHabitat) {
        AnimalName = animalName;
        AnimalCategory = animalCategory;
        AnimalFood = animalFood;
        AnimalHabitat = animalHabitat;
    }

    public String getAnimalName() {
        return AnimalName;
    }

    public void setAnimalName(String animalName) {
        AnimalName = animalName;
    }

    public String getAnimalCategory() {
        return AnimalCategory;
    }

    public void setAnimalCategory(String animalCategory) {
        AnimalCategory = animalCategory;
    }

    public String getAnimalFood() {
        return AnimalFood;
    }

    public void setAnimalFood(String animalFood) {
        AnimalFood = animalFood;
    }

    public String getAnimalHabitat() {
        return AnimalHabitat;
    }

    public void setAnimalHabitat(String animalHabitat) {
        AnimalHabitat = animalHabitat;
    }
}

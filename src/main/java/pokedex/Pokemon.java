/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.pokedex;

/**
 *
 * @author Guillermo
 */
public class Pokemon {

    private final String name;
    private final String description;
    private final String height;
    private final String weight;
    private final String categorie;
    private final String firstType;
    private final String secondType;

    public Pokemon(String name, String description, String height, String weight, String categorie, String firstType, String secondType) {
        this.name = name;
        this.description = description.replaceAll("\"", "");
        this.height = height;
        this.weight = weight;
        this.categorie = categorie;
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public Pokemon(String name, String description, String height, String weight, String categorie, String firstType) {
        this.name = name;
        this.description = description.replaceAll("\"", "");
        this.height = height;
        this.weight = weight;
        this.categorie = categorie;
        this.firstType = firstType;
        this.secondType = "";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getHeight() {
        return height;
    }

    public String getWeight() {
        return weight;
    }

    public String getCategorie() {
        return categorie;
    }

    public String getFirstType() {
        return firstType;
    }

    public String getSecondType() {
        return secondType;
    }
}

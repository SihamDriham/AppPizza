package com.example.tp2.classes;

import java.io.Serializable;

public class Produit implements Serializable {

    private int id, nbrIngredients, photo;
    private String nom, detaisIngred, description, preparation, duree;

    private static int comp;

    public Produit() {
    }

    public Produit(String nom, int nbrIngredients, int photo, String duree, String detaisIngred, String description, String preparation) {
        this.id = ++comp;
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaisIngred = detaisIngred;
        this.description = description;
        this.preparation = preparation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int getComp() {
        return comp;
    }

    public static void setComp(int comp) {
        Produit.comp = comp;
    }

    public String getDetaisIngred() {
        return detaisIngred;
    }

    public void setDetaisIngred(String detaisIngred) {
        this.detaisIngred = detaisIngred;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", nom='" + nom + '\'' +
                ", detaisIngred='" + detaisIngred + '\'' +
                ", preparation='" + preparation + '\'' +
                ", duree=" + duree +
                '}';
    }
}

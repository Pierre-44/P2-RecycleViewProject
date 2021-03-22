package com.pierre44.recycleviewproject;


public class Person {
    public String mNom;
    public String mPrenom;


    public Person (String Nom, String Prenom) {
        mNom = Nom;
        mPrenom = Prenom;
    }
    public String getNom() {
        return mNom;
    }
    public String getPrenom() {
        return mPrenom;
    }
}
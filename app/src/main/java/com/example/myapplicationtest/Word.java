package com.example.myapplicationtest;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id = 0; // 하나의 사용자에 대한 값

    private String Book;
    private String Unit;
    private String Mots;
    private String Meaning;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String unit) {
        Unit = unit;
    }

    public String getMots() {
        return Mots;
    }

    public void setMots(String mots) {
        Mots = mots;
    }

    public String getMeaning() {
        return Meaning;
    }

    public void setMeaning(String meaning) {
        Meaning = meaning;
    }
}

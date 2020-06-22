package com.example.health;

import java.util.ArrayList;
import java.util.List;

public class Profil {
    private String name;
    private int age;



    public Profil(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" "+ age + " лет(года)";
    }
}

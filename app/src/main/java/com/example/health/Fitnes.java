package com.example.health;

import java.time.LocalDateTime;

public class Fitnes {
    private int step;
    private double weight;
    private LocalDateTime date;

    public Fitnes(int step, double weight) {
        this.step = step;
        this.weight = weight;
    }
}

package com.example.health;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Pressure {
    private int presUp;
    private int presDown;
    private int pulse;
    //private LocalDateTime date;
    private Boolean tach;


    public Pressure(int presUp, int presDown, int pulse, Boolean tach) {
        this.presUp = presUp;
        this.presDown = presDown;
        this.pulse = pulse;
        //this.date = date;
        this.tach = tach;
    }




}

package com.example.health;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class PresSave {
    private Map<LocalDateTime, Pressure> pressureMap =new TreeMap<>();

    public void addPres(LocalDateTime date, Pressure pressure) {
        pressureMap.put(date, pressure);
    }
}

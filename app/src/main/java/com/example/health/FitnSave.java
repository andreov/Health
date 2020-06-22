package com.example.health;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

public class FitnSave {
    private Map<LocalDateTime,Fitnes > fitnesMap =new TreeMap<>();

    public void addPres(LocalDateTime date,Fitnes fitnes ) {
        fitnesMap.put(date,fitnes);
    }
}

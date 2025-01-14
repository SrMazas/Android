package com.example.myrecycledview;

import java.util.ArrayList;
import java.util.HashMap;

public class Datos {
    private static Datos instance; // Al estar internamente autoreferenciada, en lenguajes como Java, el recolector de basura no actúa.
    private final HashMap<String, Object> extras = new HashMap<>();
    private Datos() {
    }
    public static Datos getInstance() {
        if (instance == null) {
            instance = new Datos();
        }
        return instance;
    }
    public void putExtra(String name, Object object) {
        extras.put(name, object);
    }
    public Object getExtra(String name) {
        return extras.get(name);
    }
    public boolean hasExtra(String name) {
        return extras.containsKey(name);
    }
    public ArrayList<Pelicula> getPelis(String name) {
        return (ArrayList<Pelicula>)extras.get(name);
    }
    public void clear() {
        extras.clear();
    }
}

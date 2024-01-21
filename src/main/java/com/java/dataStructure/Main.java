package com.java.dataStructure;

import java.util.*;

public class Main {

    List<String> album90s = new ArrayList<>();
    public static void main(String[] args) {

        //new Main().populate_album90s();
       // Main.hashMapExaples();
        hasmapexercise();
    }

    public static void hasSetExercise(){

    }

    public static void hasmapexercise(){
        List<String> noLimit = new ArrayList<>();
        noLimit.add("No Limit");
        noLimit.add("Get Ready");
        noLimit.add("No One");
        noLimit.add("Twilight Zone");



        HashMap<String,List<String>> albums = new HashMap<>();
        albums.put("Two Unlimited",noLimit);
        System.out.println(albums);

    }

    public static void hashMapExaples(){
        Map<String, String > countries = new HashMap<>();
        countries.put("Poland", "Warszawa");
        countries.put("Ireland", "Dublin");
        countries.put("UK", "London");
        countries.put("Syria", "Damascus");
        System.out.println(countries);
        countries.keySet().forEach(System.out::println);
        System.out.println("-----------Values -------------------");
        countries.values().forEach(System.out::println);
  }

    public void populate_album90s(){
        album90s.add("Two Unlimited");
        album90s.add("La Buche");
        album90s.add("Sccatman");
        album90s.add("Haddaway");
        album90s.forEach(a -> System.out.println(a));
        Collections.sort(album90s);
        System.out.println("Sported ----------");
        album90s.forEach(a -> System.out.println(a));

    }
}

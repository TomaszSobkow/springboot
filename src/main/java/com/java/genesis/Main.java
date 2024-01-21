package com.java.genesis;

import com.java.genesis.adam.Abel;
import com.java.genesis.adam.Adam;
import com.java.genesis.adam.Cain;
import com.java.genesis.adam.seth.Seth;
import com.java.genesis.adam.seth.enosh.Enoch;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static List<Person> adamDescendants = new ArrayList<>();

    public static void main(String[] args) {

        populateAdamDescendant(false);
        System.out.println(adamDescendants);

    }

    public static void populateAdamDescendant(boolean isDescription){
        adamDescendants.add(new Adam("Adam",isDescription));
        adamDescendants.add(new Cain("Cain",isDescription));
        adamDescendants.add(new Abel("Abel",isDescription));
        adamDescendants.add(new Seth("Seth",isDescription));
        adamDescendants.add(new Enoch("Enoch",isDescription));
    }




}
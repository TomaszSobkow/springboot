package com.java.genesis.adam;

import com.java.genesis.Person;

public class Adam extends Person {

    public Adam(String name, boolean isDescription) {
        super(name, isDescription);
        setDescription("");
        if(isDescription){
            setDescription("the “son of God,”the first human creature! (Lu 3:38)");
        }

    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+": "+ getDescription();
    }
}

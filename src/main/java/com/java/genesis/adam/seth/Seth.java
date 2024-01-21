package com.java.genesis.adam.seth;


import com.java.genesis.adam.Adam;

public class Seth extends Adam {

    public Seth(String name, boolean isDescription) {
        super(name, isDescription);
        setDescription("");
        if(isDescription){
            setDescription("lived for 807 years.");
        }
    }

    @Override
    public String toString() {
        return "\n\t"+getClass().getSimpleName()+ ": " + getDescription();
    }
}

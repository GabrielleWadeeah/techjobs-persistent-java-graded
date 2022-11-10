package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;


@Entity
public class Skill extends AbstractEntity {

    @Size(min = 15, max = 150, message = "Must be less than 150 characters.")
    private String description;

    //constructor
    public Skill(String description){
        this.description = description;
    }

    //accessor methods
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    //no arg constructor
    public Skill(){
        super();
    }
}
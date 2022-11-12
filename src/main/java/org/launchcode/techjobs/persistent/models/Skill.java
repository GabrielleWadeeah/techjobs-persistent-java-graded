package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message= "Description is required.")
    @Size(min = 15, max = 150, message = "Description must be less than 150 characters.")
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
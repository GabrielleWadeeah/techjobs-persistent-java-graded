package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    //Added String field for location, with annotations to make sure it has a reasonable length/not empty.
    @Size(min = 3, max = 80, message = "Must be less than 80 characters.")
    @NotBlank(message= "Location is required")
    private String location;

    //constructor
    public Employer(String location) {
        this.location = location;
    }

    //Accessor methods
    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    //no arg constructor
    public Employer(){
        super();
    }
}

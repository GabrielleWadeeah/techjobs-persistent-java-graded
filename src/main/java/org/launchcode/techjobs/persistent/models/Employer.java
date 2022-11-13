package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @OneToMany
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    //Added String field for location, with annotations to make sure it has a reasonable length/not empty.
    @Size(min = 3, max = 80, message = "Must be less than 80 characters.")
    @NotBlank(message= "Location is required")
    private String location;

    //constructor
    public Employer(String location) {

        this.location = location;
    }

    //no arg constructor
    public Employer(){
    }

    //Accessor methods
    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

}

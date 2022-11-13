package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {

    @ManyToMany(mappedBy="skills")
    private final List<Job> jobs = new ArrayList<>();

    @NotBlank(message = "Description is required.")
    @Size(min = 10, max = 150, message = "Description must be between 10 than 150 characters.")
    private String description;

    //constructor
    public Skill(String description) {

        this.description = description;
    }

    //no arg constructor
    public Skill() {
    }

    //accessor methods
    public List<Job> getJobs() {
        return jobs;
    }

//    public void setJobs(List<Job> jobs) {
//        this.jobs = jobs;
//    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
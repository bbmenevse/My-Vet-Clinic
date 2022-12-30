package com.example.myvetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;

@Entity
public class Speciality extends BaseEntity{

    @Column
    private String description;

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }
}

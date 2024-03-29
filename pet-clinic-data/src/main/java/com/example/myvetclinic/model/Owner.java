package com.example.myvetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "owners")
public class Owner extends Person{

    @Column(name = "adress")
    private String adress;
    @Column(name="city")
    private String city;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "owner")
    private Set<Pet> pets =new HashSet<>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

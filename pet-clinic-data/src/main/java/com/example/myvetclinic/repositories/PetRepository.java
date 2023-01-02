package com.example.myvetclinic.repositories;

import com.example.myvetclinic.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Long> {

}

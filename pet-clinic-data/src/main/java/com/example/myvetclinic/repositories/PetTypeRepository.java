package com.example.myvetclinic.repositories;

import com.example.myvetclinic.model.PetType;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PetTypeRepository extends JpaRepository<PetType,Long> {
}

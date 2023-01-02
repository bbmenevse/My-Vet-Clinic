package com.example.myvetclinic.repositories;

import com.example.myvetclinic.model.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SpecialityRepository extends JpaRepository<Speciality,Long> {
}

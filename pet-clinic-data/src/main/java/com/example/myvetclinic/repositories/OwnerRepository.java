package com.example.myvetclinic.repositories;

import com.example.myvetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Long> {

    Owner findByLastName(String lastName);

}

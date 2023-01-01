package com.example.myvetclinic.repositories;

import com.example.myvetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner,Long> {
    

}

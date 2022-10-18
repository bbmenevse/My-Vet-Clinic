package com.example.myvetclinic.services;

import com.example.myvetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);


}

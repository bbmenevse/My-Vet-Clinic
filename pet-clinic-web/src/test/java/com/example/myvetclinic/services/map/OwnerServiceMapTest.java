package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerServiceMapTest {

    OwnerServiceMap ownerServiceMap;

    Long ownerId=5L;
    @BeforeEach
    void setUp() {
        ownerServiceMap = new OwnerServiceMap(new PetServiceMap(new PetTypeServiceMap()));

        Owner owner=new Owner();
        owner.setId(ownerId);
        ownerServiceMap.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet=ownerServiceMap.findAll();

        assertEquals(1,ownerSet.size());

    }

    @Test
    void deleteById() {
        ownerServiceMap.deleteById(ownerId);

    }

    @Test
    void delete() {
        ownerServiceMap.delete(ownerServiceMap.findById(ownerId));
        assertEquals(0,ownerServiceMap.findAll().size());
    }

    @Test
    void save() {
        Owner owner2 = new Owner();
        owner2.setId(99L);
        ownerServiceMap.save(owner2);
        assertEquals(2,ownerServiceMap.findAll().size());
    }

    @Test
    void findById() {
        Owner owner=ownerServiceMap.findById(ownerId);

        assertEquals(ownerId,owner.getId());
    }

    @Test
    void findByLastName() {
    }
}
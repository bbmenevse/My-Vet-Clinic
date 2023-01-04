package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Pet;
import com.example.myvetclinic.repositories.PetRepository;
import com.example.myvetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class PetJpaService extends AbstractJpaService<Pet, PetRepository> implements PetService {

    public PetJpaService(PetRepository repository) {
        super(repository);
    }

}

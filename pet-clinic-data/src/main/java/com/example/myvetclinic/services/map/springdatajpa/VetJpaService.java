package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Vet;
import com.example.myvetclinic.repositories.VetRepository;
import com.example.myvetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class VetJpaService extends AbstractJpaService<Vet,VetRepository> implements VetService {

    public VetJpaService(VetRepository repository) {
        super(repository);
    }
}

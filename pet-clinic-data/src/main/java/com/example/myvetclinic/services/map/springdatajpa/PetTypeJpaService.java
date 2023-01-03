package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.PetType;
import com.example.myvetclinic.repositories.PetTypeRepository;
import com.example.myvetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class PetTypeJpaService extends AbstractJpaService<PetType, PetTypeRepository> implements PetTypeService {
    public PetTypeJpaService(PetTypeRepository repository)
    {
        super(repository);
    }
}

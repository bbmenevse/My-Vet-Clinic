package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.repositories.OwnerRepository;
import com.example.myvetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@Service
@Profile("springdatajpa")
@Transactional
public class OwnerJpaService extends AbstractJpaService <Owner,OwnerRepository> implements OwnerService {

    public OwnerJpaService(OwnerRepository ownerRepository)
    {
        super(ownerRepository);
    }

    @Override
    public Owner findByLastName(String lastName)
    {
        return repository.findByLastName(lastName);
    }
}

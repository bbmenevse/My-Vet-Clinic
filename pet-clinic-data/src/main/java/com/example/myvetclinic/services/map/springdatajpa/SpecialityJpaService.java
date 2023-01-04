package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Speciality;
import com.example.myvetclinic.repositories.SpecialityRepository;
import com.example.myvetclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class SpecialityJpaService extends AbstractJpaService<Speciality, SpecialityRepository> implements SpecialitiesService {

    public SpecialityJpaService(SpecialityRepository repository) {
        super(repository);
    }
}

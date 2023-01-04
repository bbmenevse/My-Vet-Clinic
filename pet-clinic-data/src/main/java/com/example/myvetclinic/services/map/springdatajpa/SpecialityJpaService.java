package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Speciality;
import com.example.myvetclinic.repositories.SpecialityRepository;
import com.example.myvetclinic.services.SpecialitiesService;

public class SpecialityJpaService extends AbstractJpaService<Speciality, SpecialityRepository> implements SpecialitiesService {

    public SpecialityJpaService(SpecialityRepository repository) {
        super(repository);
    }
}

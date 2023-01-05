package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Visit;
import com.example.myvetclinic.repositories.VisitRepository;
import com.example.myvetclinic.services.VisitService;

public class VisitJpaService extends AbstractJpaService<Visit, VisitRepository> implements VisitService {
    
    public VisitJpaService(VisitRepository repository) {
        super(repository);
    }
}

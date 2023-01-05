package com.example.myvetclinic.services.map.springdatajpa;

import com.example.myvetclinic.model.Visit;
import com.example.myvetclinic.repositories.VisitRepository;
import com.example.myvetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Profile("springdatajpa")
@Transactional
public class VisitJpaService extends AbstractJpaService<Visit, VisitRepository> implements VisitService {
    
    public VisitJpaService(VisitRepository repository) {
        super(repository);
    }
}

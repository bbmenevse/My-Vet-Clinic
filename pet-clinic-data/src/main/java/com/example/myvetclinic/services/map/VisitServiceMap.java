package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Visit;
import com.example.myvetclinic.services.PetService;
import com.example.myvetclinic.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VisitServiceMap extends AbstractServiceMap<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit object) {
        if(object==null || object.getPet()==null || object.getPet().getOwner()==null)
        {
            return null;
            //throw new RuntimeException("Invalid Visit Information!");
        }
        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

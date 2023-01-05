package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Vet;
import com.example.myvetclinic.services.SpecialitiesService;
import com.example.myvetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractServiceMap<Vet,Long> implements VetService {

    private SpecialitiesService specialitiesService;

    @Autowired
    public VetServiceMap(SpecialitiesService specialitiesService) {
        this.specialitiesService = specialitiesService;
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object==null)
        {
            return null;
            //throw new RuntimeException("Vet object can't be null!");
        }

        if(object.getSpecialities().isEmpty())
        {
            return null;
            //throw new RuntimeException("Vets can't exist without any specialities!");
        }
        else
        {
            object.getSpecialities().forEach(speciality -> specialitiesService.save(speciality));

        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Vet> findAll()
    {
        return super.findAll();
    }

}

package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Speciality;
import com.example.myvetclinic.services.SpecialitiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default","map"})
public class SpecialityServiceMap extends AbstractServiceMap<Speciality,Long> implements SpecialitiesService {
    public Speciality findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {

        if(object==null)
        {
            return null;
        }
        Speciality speciality = findByDescription(object.getDescription());

        if(speciality==null)
        {
            System.out.println("Saving object into Speciality type object!");
            return super.save(object);
        }
        //if Speciality already exists, return it
        return object;
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Set<Speciality> findAll()
    {
        return super.findAll();
    }

    private Speciality findByDescription(String description)
    {
        if(description==null)
        {
            throw new RuntimeException("No Specialities description was submitted!");
        }
        // If the pet type already exists in the list, return that pet type. Else, return null
        Speciality speciality_ = findAll().stream().filter(speciality->speciality.getDescription().equals(description)).findFirst().orElse(null);
//        System.out.println(name);
//        System.out.println(x);
//        System.out.println("****************************");
        return speciality_;
    }
}

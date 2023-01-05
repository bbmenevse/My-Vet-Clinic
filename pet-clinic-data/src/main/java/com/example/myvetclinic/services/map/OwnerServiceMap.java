package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerServiceMap extends AbstractServiceMap<Owner,Long> implements OwnerService {


    private final PetService petService;


    @Autowired
    public OwnerServiceMap(PetService petService) {
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {

        if(object==null)
        {
            throw new RuntimeException("Owner object can't be null!");
        }
        if(object.getPets()!=null)
        {
            // Is pet null, does it have a pet type or similar situations are checked on the relevant map classes.
            object.getPets().forEach(pet->petService.save(pet));
        }

        return super.save(object);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .orElse(null);
    }

}


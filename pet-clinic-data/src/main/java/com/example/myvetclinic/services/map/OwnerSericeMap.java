package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.model.PetType;
import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.PetService;
import com.example.myvetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class OwnerSericeMap extends AbstractMapService<Owner,Long> implements OwnerService {


    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerSericeMap(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
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

        if(object!=null)
        {
            if(object.getPets()!=null)
            {

            }
        }

        // Farklı bir yöntem implement ediyorum.
        /*if(object!=null)
        {
            if(object.getPets()!=null)
            {
                object.getPets().forEach(pet->{
                    if(pet.getPetType()!=null)
                    {
                        if(pet.getPetType().getId() ==null )
                        {

                        }
                    }
                    else {
                        throw new RuntimeException("Pet type was not specified!");
                    }
                });
            }
        }*/
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


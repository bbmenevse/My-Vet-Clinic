package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Pet;
import com.example.myvetclinic.services.PetService;
import com.example.myvetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class PetServiceMap extends AbstractServiceMap<Pet,Long> implements PetService {

    private PetTypeService petTypeService;

    @Autowired
    public PetServiceMap(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object)
    {
        //Throw Exception if the object is null
        if(object==null)
        {
            throw new RuntimeException("Pet object is empty!");
        }
        //Throw Exception if the object doesn't contain a Pet Type.
        if(object.getPetType()==null)
        {
            System.out.println("Pet type was null!");
            return null;
            //throw new RuntimeException("Pets must have a Type!");
        }
        else
        //Try to save Object's Pettype first.
        {
            object.setPetType(petTypeService.save(object.getPetType()));
        }
        // If the Pet does not have a owner with name or surname, it will throw an error
        if(object.getOwner().getFirstName()==null && object.getOwner().getLastName()==null)
        {
            throw new RuntimeException("Pets must have an owner!");
        }
        //If pet object does not have a name, then it will set it automatically
        if(object.getPetName()==null)
        {
            object.setPetName("No pet name specified!");
        }

        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}

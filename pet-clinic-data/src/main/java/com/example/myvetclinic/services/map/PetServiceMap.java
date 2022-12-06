package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.Pet;
import com.example.myvetclinic.services.PetService;
import com.example.myvetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    private PetTypeService petTypeService;
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
        if(object==null)
        {
            throw new RuntimeException("Pet object is empty!");
        }
        if(object.getPetType()==null)
        {
            throw new RuntimeException("Pets must have a Type!");
        }
        else
        {
                petTypeService.save(object.getPetType()); //
        }
        if(object.getOwner().getFirstName()==null && object.getOwner().getLastName()==null)
        {
            throw new RuntimeException("Pets must have an owner!");
        }
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

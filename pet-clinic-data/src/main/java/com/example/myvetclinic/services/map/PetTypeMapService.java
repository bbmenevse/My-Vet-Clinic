package com.example.myvetclinic.services.map;

import com.example.myvetclinic.model.PetType;
import com.example.myvetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class PetTypeMapService extends AbstractMapService<PetType,Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }


    @Override
    public PetType save(PetType object) {

        // Pettype Can not be null
        if(object==null)
        {
            throw new RuntimeException("Pet type is null!");
        }
        //Check if the given petType already exists and assign it to petType object
        PetType petType = findByName(object.getName());
        //If petType object is null, then create it as a new pet type and return it.
        if(petType==null)
        {
            System.out.println("Saving object into PetTypeObject");
            return super.save(object);

        }
        // if petType already exists, return it.
        else
        {
            return object;
        }

    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    //
    private PetType findByName(String name)
    {
        if(name==null)
        {
            throw new RuntimeException("No PetType was submitted!");
        }
        // If the pet type already exists in the list, return that pet type. Else, return null
        PetType x = findAll().stream().filter(petType -> petType.getName().equals(name)).findFirst().orElse(null);
//        System.out.println(name);
//        System.out.println(x);
//        System.out.println("****************************");
        return x;
    }
}

package com.example.myvetclinic.bootstrap;
import com.example.myvetclinic.model.*;
import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.PetTypeService;
import com.example.myvetclinic.services.SpecialitiesService;
import com.example.myvetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    private final SpecialitiesService specialitiesService;

    public DataLoader(OwnerService ownerService,VetService vetService, PetTypeService petTypeService,SpecialitiesService specialitiesService)
    {
        System.out.println("Creating the component: DataLoader");

        this.ownerService=ownerService;

        this.vetService=vetService;

        this.petTypeService=petTypeService;

        this.specialitiesService=specialitiesService;
        /*
        ownerService = new OwnerSericeMap();
        vetService = new VetServiceMap();
        */
    }
    @Override
    public void run(String... args) throws Exception {

        System.out.println("void run inside the DataLoader called...");

        Speciality radiology=new Speciality();
        radiology.setDescription("Radiology");
        radiology = specialitiesService.save(radiology);

        PetType dog = new PetType();
        dog.setName("Doggo");
        dog = petTypeService.save(dog);


        PetType cat = new PetType();
        cat.setName("Cat");
        cat = petTypeService.save(cat);

        PetType cat2 = new PetType();
        cat2.setName("Cat");
        cat2 = petTypeService.save(cat2);

        //System.out.println(dog.getId() + " Id of the Dog");

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");
        owner1.setAdress("Boofaloo 12 st patrick");
        owner1.setCity("Boofaloo");
        owner1.setTelephone("0532323232");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);


        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vet1.getSpecialities().add(radiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");
        vet2.getSpecialities().add(radiology);

        Pet pet = new Pet();
        pet.setPetType(cat);
        pet.setPetName("Dragon");

        Pet pet2 = new Pet();
        pet2.setPetType(new PetType());
        pet2.setPetName("Draken");

        System.out.println(" Pet petType; ");
        System.out.println(pet.getPetType());
        System.out.println(pet.getPetType().getId());
        vetService.save(vet2);

    }
}

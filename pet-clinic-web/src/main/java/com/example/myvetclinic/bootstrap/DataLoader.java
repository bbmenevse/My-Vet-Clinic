package com.example.myvetclinic.bootstrap;
import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.model.PetType;
import com.example.myvetclinic.model.Vet;
import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.PetTypeService;
import com.example.myvetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService,VetService vetService, PetTypeService petTypeService)
    {
        System.out.println("Creating the component: DataLoader");

        this.ownerService=ownerService;

        this.vetService=vetService;

        this.petTypeService=petTypeService;
        /*
        ownerService = new OwnerSericeMap();
        vetService = new VetServiceMap();
        */
    }
    @Override
    public void run(String... args) throws Exception {

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

        System.out.println("void run inside the DataLoader called...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

    }
}

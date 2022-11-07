package com.example.myvetclinic.bootstrap;
import com.example.myvetclinic.model.Owner;
import com.example.myvetclinic.model.Vet;
import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService,VetService vetService)
    {
        System.out.println("Creating the component: DataLoader");

        this.ownerService=ownerService;

        this.vetService=vetService;
        /*
        ownerService = new OwnerSericeMap();
        vetService = new VetServiceMap();
        */
    }
    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Micheal");
        owner1.setLastName("Weston");

        ownerService.save(owner1);



        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerService.save(owner2);


        System.out.println("Loaded Owners....");

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

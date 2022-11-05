package com.example.myvetclinic.bootstrap;

import com.example.myvetclinic.services.OwnerService;
import com.example.myvetclinic.services.VetService;
import com.example.myvetclinic.services.map.OwnerSericeMap;
import com.example.myvetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader()
    {
        ownerService = new OwnerSericeMap();

        vetService = new VetServiceMap();

    }
    @Override
    public void run(String... args) throws Exception {

    }
}

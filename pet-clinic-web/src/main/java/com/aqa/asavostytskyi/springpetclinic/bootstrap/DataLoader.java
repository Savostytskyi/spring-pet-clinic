package com.aqa.asavostytskyi.springpetclinic.bootstrap;

import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;
import com.aqa.asavostytskyi.springpetclinic.model.person.Vet;
import com.aqa.asavostytskyi.springpetclinic.services.OwnerService;
import com.aqa.asavostytskyi.springpetclinic.services.VetService;
import com.aqa.asavostytskyi.springpetclinic.services.map.OwnerServiceMap;
import com.aqa.asavostytskyi.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("John");
        vet1.setLastName("Michael");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

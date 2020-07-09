package com.aqa.asavostytskyi.springpetclinic.bootstrap;

import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;
import com.aqa.asavostytskyi.springpetclinic.model.person.Vet;
import com.aqa.asavostytskyi.springpetclinic.model.pet.Pet;
import com.aqa.asavostytskyi.springpetclinic.model.pet.PetType;
import com.aqa.asavostytskyi.springpetclinic.services.OwnerService;
import com.aqa.asavostytskyi.springpetclinic.services.PetTypeService;
import com.aqa.asavostytskyi.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("123123123");
        ownerService.save(owner1);

        Pet mikesPet = new Pet();
        mikesPet.setName("Rosco");
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("123123123");
        ownerService.save(owner2);

        Pet fionasPet = new Pet();
        mikesPet.setName("Meow");
        mikesPet.setPetType(savedCatPetType);
        mikesPet.setOwner(owner2);
        mikesPet.setBirthDate(LocalDate.now());
        owner2.getPets().add(fionasPet);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("John");
        vet2.setLastName("Michael");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}

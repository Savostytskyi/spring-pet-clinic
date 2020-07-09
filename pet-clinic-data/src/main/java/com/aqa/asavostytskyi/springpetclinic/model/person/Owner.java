package com.aqa.asavostytskyi.springpetclinic.model.person;

import com.aqa.asavostytskyi.springpetclinic.model.pet.Pet;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Owner extends Person {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();
}

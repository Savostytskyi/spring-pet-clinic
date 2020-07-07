package com.aqa.asavostytskyi.springpetclinic.model.pet;

import com.aqa.asavostytskyi.springpetclinic.model.BaseEntity;
import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Pet extends BaseEntity {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}

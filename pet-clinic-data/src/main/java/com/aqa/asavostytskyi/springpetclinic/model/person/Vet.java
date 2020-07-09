package com.aqa.asavostytskyi.springpetclinic.model.person;

import com.aqa.asavostytskyi.springpetclinic.model.Specialty;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class Vet extends Person {

    private Set<Specialty> specialties;
}

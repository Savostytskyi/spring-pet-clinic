package com.aqa.asavostytskyi.springpetclinic.services;

import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

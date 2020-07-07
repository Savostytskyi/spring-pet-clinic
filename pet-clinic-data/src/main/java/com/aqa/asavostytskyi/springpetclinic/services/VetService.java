package com.aqa.asavostytskyi.springpetclinic.services;

import com.aqa.asavostytskyi.springpetclinic.model.person.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}

package com.aqa.asavostytskyi.springpetclinic.services;

import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}

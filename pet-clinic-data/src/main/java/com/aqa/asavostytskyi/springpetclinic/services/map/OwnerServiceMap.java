package com.aqa.asavostytskyi.springpetclinic.services.map;

import com.aqa.asavostytskyi.springpetclinic.model.person.Owner;
import com.aqa.asavostytskyi.springpetclinic.services.CrudService;

import java.util.Set;

public final class OwnerServiceMap extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
}

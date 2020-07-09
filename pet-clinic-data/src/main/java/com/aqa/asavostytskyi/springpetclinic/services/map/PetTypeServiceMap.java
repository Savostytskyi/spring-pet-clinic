package com.aqa.asavostytskyi.springpetclinic.services.map;

import com.aqa.asavostytskyi.springpetclinic.model.pet.PetType;
import com.aqa.asavostytskyi.springpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public final class PetTypeServiceMap extends AbstractMapService<PetType, Long>
        implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }
}

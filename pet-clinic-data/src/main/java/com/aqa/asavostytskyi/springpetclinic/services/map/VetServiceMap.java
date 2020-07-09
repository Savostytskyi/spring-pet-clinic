package com.aqa.asavostytskyi.springpetclinic.services.map;

import com.aqa.asavostytskyi.springpetclinic.model.Speciality;
import com.aqa.asavostytskyi.springpetclinic.model.person.Vet;
import com.aqa.asavostytskyi.springpetclinic.services.SpecialtyService;
import com.aqa.asavostytskyi.springpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Set;

@Service
public final class VetServiceMap extends AbstractMapService<Vet, Long>
        implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        Objects.requireNonNull(vet);
        if (!vet.getSpecialties().isEmpty()) {
            vet.getSpecialties().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpeciality = specialtyService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(vet);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

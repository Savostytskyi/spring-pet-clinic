package com.aqa.asavostytskyi.springpetclinic.model.pet;

import com.aqa.asavostytskyi.springpetclinic.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetType extends BaseEntity {

    private String name;
}

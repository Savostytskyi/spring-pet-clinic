package com.aqa.asavostytskyi.springpetclinic.model.person;

import com.aqa.asavostytskyi.springpetclinic.model.BaseEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
}

package org.opencredo.roo.jpa.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.opencredo.roo.jpa.domain.Gender;
import javax.persistence.Enumerated;

@RooJavaBean
@RooToString
@RooEntity
public class Person {

    @Enumerated
    private Gender gender;
}

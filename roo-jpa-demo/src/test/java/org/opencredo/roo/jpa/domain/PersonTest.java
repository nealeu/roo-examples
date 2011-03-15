package org.opencredo.roo.jpa.domain;

import org.junit.Test;

public class PersonTest {

    @Test
    public void testMethod() {
        int expectedCount = 13;
        Person.countPeople();
        org.springframework.mock.staticmock.AnnotationDrivenStaticEntityMockingControl.expectReturn(expectedCount);
        org.springframework.mock.staticmock.AnnotationDrivenStaticEntityMockingControl.playback();
        org.junit.Assert.assertEquals(expectedCount, Person.countPeople());
    }
}

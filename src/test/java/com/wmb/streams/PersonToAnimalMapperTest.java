package com.wmb.streams;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by robertmurray on 3/11/17.
 */
public class PersonToAnimalMapperTest {


    @Test
    public void singleConversionTest(){
        PersonToAnimalMapper p2a = new PersonToAnimalMapper();
        Person p = new Person("bill","murray",new Date(),Gender.MALE);
        Animal a = p2a.convert(p);

        assertNotNull(a);
        assertTrue(a.getDateOfBirth()==p.getDateOfBirth());

    }

    @Test
    public void convertListTest(){
        List<Animal> animals =null;
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("bill","murray",new Date(),Gender.MALE));
        persons.add(new Person("bill","smith",new Date(),Gender.MALE));
        persons.add(new Person("will","smith",new Date(),Gender.MALE));
        PersonToAnimalMapper p2a = new PersonToAnimalMapper();
        animals =p2a.convert(persons);
        assertNotNull(animals);
        assertTrue(animals.size()==persons.size());

    }


}

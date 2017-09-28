package com.wmb.streams;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by robertmurray on 3/11/17.
 */
public class PersonToAnimalMapper {

    public List<Animal> convert(List<Person> persons){
        return persons.stream().map(convert).collect(Collectors.toList());
    }

    public Animal convert(Person person) {
        return convert.apply(person);
    }

    Function<Person, Animal> convert = new Function<Person, Animal>() {
        @Override
        public Animal apply(Person person) {
            Animal retAnimal = null;
            if (person != null) {
                String name = person.getFirstName() + person.getLastName();
                retAnimal = new Animal(name, person.getDateOfBirth(), person.getGender());
            }
            return retAnimal;
        }
    };


}

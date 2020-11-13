package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testAddDog() {
        String name = "Shia";
        Date birthDate = new Date();
        Integer dogId = 0;

        Dog puppy = new Dog(name,birthDate,dogId);
        DogHouse.add(puppy);

        Dog actualPup = DogHouse.getDogById(dogId);

        assertEquals(puppy, actualPup);
    }

    @Test
    public void testRemoveDog() {
        String name = "Shia";
        Date birthDate = new Date();
        Integer dogId = 0;

        Dog puppy = new Dog(name,birthDate,dogId);
        DogHouse.add(puppy);
        DogHouse.remove(dogId);

        Dog pupRemoved = DogHouse.getDogById(dogId);
        assertNull(pupRemoved);
    }

    @Test
    public void testRemoveByDog() {
        String name = "Shia";
        Date birthDate = new Date();
        Integer dogId = 0;

        Dog puppy = new Dog(name,birthDate,dogId);
        DogHouse.add(puppy);
        DogHouse.remove(puppy);

        Dog pupRemoved = DogHouse.getDogById(0);
        assertNull(pupRemoved);
    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}

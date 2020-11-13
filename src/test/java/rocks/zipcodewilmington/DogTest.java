package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void testNewDog() {
        String expectedName = "Shia";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        Dog puppy = new Dog(expectedName,expectedBirthDate,expectedId);

        String actualName = puppy.getName();
        Date actualBirthdate = puppy.getBirthDate();
        Integer actualId = puppy.getId();

        assertEquals(expectedName,actualName);
        assertEquals(expectedBirthDate,actualBirthdate);
        assertEquals(expectedId,actualId);
    }

    @Test
    public void testSpeak() {
        String expectedSpeak = "bark!";
        Dog pup = new Dog("",new Date(),0);
        String actualSpeak = pup.speak();

        assertEquals(expectedSpeak,actualSpeak);
    }

    @Test
    public void setBirthDate() {
        Date expectedBirthdate = new Date();
        Dog pup = new Dog("",expectedBirthdate,0);
        Date actualBirthDate = pup.getBirthDate();

        assertEquals(expectedBirthdate,actualBirthDate);
    }

    @Test
    public void testEat() {
        Dog pup = new Dog("", new Date(), 0);
        Food food = new Food();
        int initialMealsEaten = pup.getNumberOfMealsEaten();
        int expectedNum = initialMealsEaten + 1;

        pup.eat(food);
        int actualNum = pup.getNumberOfMealsEaten();

        Assert.assertEquals(expectedNum, actualNum);
    }

    @Test
    public void testId() {
        Integer expectedId = 0;
        Dog pup = new Dog("", new Date(), 0);
        Integer actualId = pup.getId();
        assertEquals(expectedId,actualId);
    }

    @Test
    public void testAnimalInheritance() {
        Dog puppy = new Dog("",new Date(), 0);

        boolean actualInstance = puppy instanceof Animal;

        assertTrue(actualInstance);
    }

    @Test
    public void testMammalInheritance() {
        Dog puppy = new Dog("",new Date(), 0);

        boolean actualInstance = puppy instanceof Mammal;

        assertTrue(actualInstance);
    }





    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        assertEquals(dogName, givenName);
    }
}

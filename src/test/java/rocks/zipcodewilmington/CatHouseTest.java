package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCat() {
        String name = "Kee-Kee";
        Date birthDate = new Date();
        Integer catId = 0;

        Cat kitty = new Cat(name,birthDate,catId);
        CatHouse.add(kitty);

        Cat actualKitty = CatHouse.getCatById(catId);

        assertEquals(kitty, actualKitty);
    }

    @Test
    public void removeCat() {
        Cat kitty = new Cat("Ki-ki",new Date(), 0);
        CatHouse.add(kitty);
        CatHouse.remove(0);

        Cat kittyCat = CatHouse.getCatById(0);

        assertNull(kittyCat);
    }

    @Test
    public void removeByCat() {
        Cat kitty = new Cat("Ki-ki",new Date(), 0);
        CatHouse.add(kitty);
        CatHouse.remove(kitty);

        Cat kittyCat = CatHouse.getCatById(0);

        assertNull(kittyCat);
    }

    @Test
    public void getCatById() {
        String name = "Kee-Kee";
        Date birthDate = new Date();
        Integer catId = 0;

        Cat kitty = new Cat(name,birthDate,catId);
        CatHouse.add(kitty);

        Cat actualKitty = CatHouse.getCatById(catId);

        assertEquals(kitty, actualKitty);
    }

    @Test
    public void getNumberOfCats() {
        String name = "Kee-Kee";
        Date birthDate = new Date();
        Integer catId = 0;
        Integer expectedNumOfCats = 1;

        Cat kitty = new Cat(name,birthDate,catId);
        CatHouse.add(kitty);

        Integer kittyNum = CatHouse.getNumberOfCats();

        assertEquals(expectedNumOfCats,kittyNum);
    }



}

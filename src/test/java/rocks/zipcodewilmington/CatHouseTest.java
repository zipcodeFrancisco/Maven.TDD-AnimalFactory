package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    private CatHouse myCatHouse;

    @Before
    public void setup(){
        myCatHouse = new CatHouse();
    }

    @After
    public void tearDown(){
        myCatHouse = null;
    }

    // TODO - Create tests for `void add(Cat cat)` (DONE)
    @Test
    public void addTest() {
        Cat myCat1 = AnimalFactory.createCat("Kitty1", new Date(2001));
        myCatHouse.add(myCat1);

        Integer expected = 1;
        Assert.assertEquals(expected, myCatHouse.getNumberOfCats());
    }

    // TODO - Create tests for `void remove(Integer id)` (DONE)
    @Test
    public void removeIdTest(){
        Cat myCat = AnimalFactory.createCat("Kitty",new Date(2000));
        Integer actualId = myCat.getId();
        myCatHouse.add(myCat);
        Integer actualCats = myCatHouse.getNumberOfCats();
        myCatHouse.remove( actualId );
        Integer expectedCats = myCatHouse.getNumberOfCats() + 1;
        Assert.assertEquals(actualCats, expectedCats);
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeTest(){

        Cat myCat = AnimalFactory.createCat("Kitty", new Date(2000));
        CatHouse myCatHouse = new CatHouse();
        myCatHouse.add(myCat);
        Integer expectedCats = myCatHouse.getNumberOfCats()-1;
        myCatHouse.remove(myCat);
        Integer actualCats = myCatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats,actualCats);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        Cat myCat = AnimalFactory.createCat("Kitty",new Date(2000));
        CatHouse myCatHouse = new CatHouse();
        Integer expectedId = myCat.getId();
        myCatHouse.add(myCat);
        Integer actualId = myCatHouse.getCatById(myCat.getId()).getId();
        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats(){
        Cat myCat = AnimalFactory.createCat("Kitty",new Date(2000));
        CatHouse myCatHouse = new CatHouse();
        myCatHouse.add(myCat);
        Integer expectedCats = 1;
        Integer actualCats = myCatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);
    }


}

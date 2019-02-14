package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        String name = "Doggy";
        Date date = new Date();
        Dog myDog = AnimalFactory.createDog(name,date);
        DogHouse myDogHouse = new DogHouse();
        myDogHouse.add(myDog);
        Integer expected = 1;
        Integer actual = myDogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createdCatTest(){
        String name = "Kitty";
        Date date = new Date(2000);
        Cat myCat = AnimalFactory.createCat(name,date);
        CatHouse myCatHouse = new CatHouse();
        myCatHouse.add(myCat);
        Integer expected = 1;
        Integer actual = myCatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }

}

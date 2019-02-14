package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    DogHouse dogHouse = new DogHouse();

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest(){
        String name = "Doggy";
        Date date = new Date(2000);
        Dog myDog = AnimalFactory.createDog(name,date);
        Integer expected = 1;
        dogHouse.add(myDog);
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        String name = "Doggy";
        Date date = new Date();
        Dog myDog = AnimalFactory.createDog(name,date);
        Integer expected = 0;
        dogHouse.add(myDog);
        dogHouse.remove(myDog.getId());
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest(){
        String name = "Doggy";
        Date date = new Date(2000);
        Dog myDog = AnimalFactory.createDog(name,date);
        Integer expected = 0;
        dogHouse.add(myDog);
        dogHouse.remove(myDog);
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        String name = "Doggy";
        Date date = new Date(2000);
        Dog myDog = AnimalFactory.createDog(name,date);
        Integer expected = myDog.getId();
        dogHouse.add(myDog);
        Integer actual = dogHouse.getDogById(myDog.getId()).getId();
        Assert.assertEquals(expected,actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        String name = "Doggy";
        Date date = new Date();
        Dog myDog = AnimalFactory.createDog(name,date);
        Integer expected = 1;
        dogHouse.add(myDog);
        Integer actual = dogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        dogHouse.clear();

        // When
        dogHouse.add(animal);

        // Then
        dogHouse.getNumberOfDogs();
    }
}

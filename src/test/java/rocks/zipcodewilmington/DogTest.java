package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void newDogTest(){
        String name = "Doggy";
        Date date = new Date(2000);
        Integer id = 123;
        Dog myDog = new Dog(name,date,id);
        DogHouse myDogHouse = new DogHouse();
        myDogHouse.add(myDog);
        Integer expected = 1;
        Integer actual = myDogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `speak`
    @Test
    public void newSpeakTest(){
        Dog myDog = new Dog("Doggy",new Date(2000),123);
        String expectedSpeak = "bark!";
        String actualSpeak = myDog.speak();
        Assert.assertEquals(expectedSpeak,actualSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Dog myDog = new Dog("Dogy",new Date(2000),123);

        Date expectedDate = new Date(2001);
        myDog.setBirthDate(new Date(2001));
        Date actualDate = myDog.getBirthDate();

        Assert.assertEquals(expectedDate,actualDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Dog myDog = new Dog("Doggy",new Date(2000),123);

        Integer expectedCounter = 1;
        myDog.eat(new Food());
        Integer actualCounter = myDog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedCounter,actualCounter);
    }
    // TODO - Create tests for `void eat(Food food)` Test to obtain a counter of 2
    @Test
    public void eatTest2(){
        Dog myDog = new Dog("Doggy",new Date(2000),123);

        Integer expectedCounter = 2;
        myDog.eat(new Food());
        myDog.eat(new Food());
        Integer actualCounter = myDog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedCounter,actualCounter);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Dog myDog = new Dog("Doggy", new Date(2000),123);

        Integer expectedId = 123;
        Integer actualId = myDog.getId();

        Assert.assertEquals(expectedId,actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritanceTest(){
        Dog myDog = new Dog("Doggy", new Date(2000),123);

        Boolean expectedValue = true;
        Boolean actualValue = myDog instanceof Animal;

        Assert.assertEquals(expectedValue,actualValue);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalTest(){
        Dog myDog = new Dog("Doggy",new Date(2000),123);

        Boolean expectedValue = true;
        Boolean actualValue = myDog instanceof Mammal;

        Assert.assertEquals(expectedValue,actualValue);
    }


    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setNameTest2(){
        Dog myDog = new Dog("Doggy",new Date(2000),123);

        String expectedDate = "Camila";
        myDog.setName(expectedDate);
        String actualValue = myDog.getName();

        Assert.assertEquals(expectedDate,actualValue);
    }
}

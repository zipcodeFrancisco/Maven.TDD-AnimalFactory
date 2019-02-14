package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import sun.misc.ClassFileTransformer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)` (DONE)
    // TODO - Create tests for `speak` (DONE)
    // TODO - Create tests for `setBirthDate(Date birthDate)` (DONE)
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()` (DONE)
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword` (DONE)
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword` (DONE)


    @Test
    public void setNameTest( ){
        // Given (cat data - Instantiated Cat)
        Cat myCat = new Cat("Green", new Date(), 1);
        // When (Create a variable for holding the expected name of the cat and set to "Red")
        String expected = "Red";
        // Set a name to the cat
        myCat.setName( expected );
        // Get the name of the instantiated cat using getName
        String actualName = myCat.getName();
        // Then (We expect that given data match to retrieved data).
        Assert.assertEquals(expected,actualName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        // Given (Instantiated Cat)
        Cat myCat = new Cat("Green",new Date(),1);
        String expected = "meow!";
        String actualSpeak = myCat.speak();
        // Then (We expect to a given data match to retrieved data)
        Assert.assertEquals(expected,actualSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        Cat myCat = new Cat("Red", new Date(2010,3,5), 1);

        Date expectedDate = new Date(2010,4,5);
        myCat.setBirthDate( expectedDate );
        Date actualDate = myCat.getBirthDate();

        Assert.assertEquals(expectedDate,actualDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat myCat = new Cat("Kitty",new Date(2000),123);
        Integer expectedCount = 1;

        myCat.eat(new Food());

        Integer actualCount = myCat.getNumberOfMealsEaten();

        Assert.assertEquals(expectedCount,actualCount);
    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Cat myCat = new Cat("Red",new Date(2000),123);
        Integer expected = 123;
        Integer actualId = myCat.getId();
        Assert.assertEquals(expected,actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void inheritanceAnimalTest(){
        Cat myCat = new Cat("Red",new Date(200),123);
        Boolean resultInstanceof = myCat instanceof Animal;
        Assert.assertTrue(resultInstanceof);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceMammalTest(){
        Cat mycat = new Cat("Red",new Date(2000),123);
        Boolean resultIntanceof = mycat instanceof Mammal;
        Assert.assertTrue(resultIntanceof);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}

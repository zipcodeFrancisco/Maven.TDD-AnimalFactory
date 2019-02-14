package rocks.zipcodewilmington;

import org.junit.Assert;
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
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
//    public void addTest(){
//        Cat myCat1 = AnimalFactory.createCat("Kitty1", new Date(2001));
//        Cat myCat2 = AnimalFactory.createCat("Kitty2", new Date(2002));
//
//        CatHouseTest.this.
//        Integer expectedId = 1;
//        Integer actualId = myCat1.getId();

        //System.out.println( myCat1.getName()+" - " + myCat2.getName()+ " - " +myCat1.getId()
        //                    + " -" + myCat2.getId() + "-" + CatHouse.getNumberOfCats());

        Assert.assertEquals(expectedId,actualId);
    }
    //    Create Test for Animal createDog(String name, Date birthDate)
    //    ensure that when .createDog is invoked on AnimalFactoryTest a Dog is created with the respective name and birthDate value.
    //    Create Test for Animal createCat(String name, Date birthDate)
    //    ensure that when .createCat is invoked on AnimalFactoryTest a Dog is created with the respective name and birthDate value.

//    @Test
//    public void constructorTest() {
//        // Given (cat data)
//        String givenName = "Zula";
//        Date givenBirthDate = new Date();
//        Integer givenId = 0;
//
//        // When (a cat is constructed)
//        Cat cat = new Cat(givenName, givenBirthDate, givenId);
//
//        // When (we retrieve data from the cat)
//        String retrievedName = cat.getName();
//        Date retrievedBirthDate = cat.getBirthDate();
//        Integer retrievedId = cat.getId();
//
//        // Then (we expect the given data, to match the retrieved data)
//        Assert.assertEquals(givenName, retrievedName);
//        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
//        Assert.assertEquals(givenId, retrievedId);
//    }
}

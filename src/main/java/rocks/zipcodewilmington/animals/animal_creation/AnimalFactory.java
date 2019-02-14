package rocks.zipcodewilmington.animals.animal_creation;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 * This class is responsible for creating animals and automatically assigning them an id
 */
public class AnimalFactory {
    public static Dog createDog(String name, Date birthDate) {
        DogHouse dogHouse = new DogHouse();
        Integer newId = dogHouse.getNumberOfDogs();
        return new Dog(name, birthDate, newId);
    }

    public static Cat createCat(String name, Date birthDate) {
        CatHouse catHouse = new CatHouse();
        Integer newId = catHouse.getNumberOfCats();
        return new Cat(name, birthDate, newId);
//        Integer newId = CatHouse.getNumberOfCats();
//        Cat cat = new Cat(name,birthDate,newId);
//        CatHouse.add(cat);
//        return cat;
    }




}

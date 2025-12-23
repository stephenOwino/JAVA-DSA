package AbstaractionAndInterfaces;

import java.util.ArrayList;

public class main {
    static void main() {

//        Animal animal = new Animal("animal" , "big", 100);  //we cannot instantiate an abstract class

    Dog dog = new Dog("Wolf", "big" , 100);
    dog.makeNoise();

    doAnimalStuff(dog);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("German Shepherd", "big" , 150));
        animals.add(new Fish("Goldfish", "small" , 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("pug", "small" ,20));
        animals.add(new Horse("Clydesdale", "large" , 1000));

        for (Animal animal : animals){
            doAnimalStuff(animal);
            if (animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }

        for (Animal animal : animals){
            doAnimalStuff(animal);
        }
    }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }

}

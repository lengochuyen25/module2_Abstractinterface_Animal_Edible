package animal;

import Ediable.Ediable;
import Fruit.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();

            if (animal instanceof Chicken) {
                Ediable ediabler;
                ediabler = (Chicken) animal;// ep ngam dinh con sang cha; (chicken)animal: ep kieu tuong minh tu cha sang con
                System.out.println(ediabler.howToEat());
            }
        }
        Apple apple= new Apple();
        System.out.println(apple.howToEat());
    }
}

package task20;

import task1.Dog;
import task19.Table;

public class Executer20 {
    public static void test() {
        Dog dog = new Dog("Bobik", 4, true);
        Table table = new Table("Stol", "wood", "classic");

        System.out.println("Dog`s price: " + dog.getPrice() + '\n');
        System.out.println("Table`s price: " + table.getPrice() + '\n');
    }
}

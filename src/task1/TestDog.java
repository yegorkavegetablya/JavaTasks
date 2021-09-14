package task1;

public class TestDog {
    public static void test() {
        Dog dog = new Dog("Sharik", 5, false);
        System.out.println("Testing dog named " + dog.getName() + " who is " + dog.getAge() + " years old, which is " +
                ((dog.isHungry()) ? ("") : ("not")) + " hungry\n");
        System.out.println("Trowing it a ball\n");
        System.out.println("Dog fetched " + dog.fetchABall("ball") + "\n");
        System.out.println("Trowing it a ball\n");
        System.out.println("Dog fetched " + dog.fetchABall("ball") + "\n");
        System.out.println("Feeding a dog\n");
        dog.eat();
        System.out.println("Trowing it a ball\n");
        System.out.println("Dog fetched " + dog.fetchABall("ball") + "\n");
    }
}

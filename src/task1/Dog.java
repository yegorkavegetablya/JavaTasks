package task1;

import task20.Pricable;

public class Dog implements Pricable {
    private String name;
    private int age;
    private boolean isHungry;
    private static final boolean isAGoodBoy = true;

    public Dog(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    public void eat() {
        setHungry(false);
    }
    public String fetchABall(String ball) {
        if (isHungry()) {
            return "nothing (" + getName() + " is hungry)";
        }
        else {
            setHungry(true);
            return ball;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }

    @Override
    public int getPrice() {
        return 10;
    }
}

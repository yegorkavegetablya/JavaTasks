package task18;

public class CircleTest {
    public static void describeCircle(Circle circle) {
        System.out.println("Круг с радиусом " + circle.getRadius() + ", находящийся в точке с абсциссой " +
                circle.getX_coordinate() + " и ординатой " + circle.getY_coordinate() + "\n");
    }

    public static void test() {
        System.out.println("Создаём круг\n");
        Circle circle = new Circle(1, 10, 12);
        CircleTest.describeCircle(circle);
        System.out.println("Переместим круг на 2.5 влево и на 5 вверх\n");
        circle.moveBy(-2.5, 5);
        CircleTest.describeCircle(circle);
        System.out.println("Увеличим его в 3.5 раза\n");
        circle.changeBy(3.5);
        CircleTest.describeCircle(circle);
    }
}

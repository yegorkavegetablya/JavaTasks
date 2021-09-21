package task6;

public class Student {
    private int id;
    private String name;
    private double average_mark;

    public Student(int id, String name, double average_mark) {
        this.id = id;
        this.name = name;
        this.average_mark = average_mark;
    }

    public String getName() {
        return name;
    }

    public double getAverage_mark() {
        return average_mark;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAverage_mark(double average_mark) {
        this.average_mark = average_mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", average_mark=" + average_mark +
                '}';
    }
}

package task6;

import java.util.ArrayList;
import java.util.Random;

public class Executer6 {
    public static void printStudentsArrayList(ArrayList<Student> studentArrayList) {
        for (Student student : studentArrayList) {
            System.out.println(student);
        }
    }

    public static void execute() {
        Student student1 = new Student(0, "Oleg", 5);
        Student student2 = new Student(1, "Ivan", 2.9);
        Student student3 = new Student(2, "Boris", 4.3);
        Student student4 = new Student(3, "Mihail", 3.5);
        Student student5 = new Student(4, "Yaroslav", 4.75);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(student5);
        studentArrayList.add(student1);
        studentArrayList.add(student4);
        studentArrayList.add(student3);
        studentArrayList.add(student2);

        printStudentsArrayList(studentArrayList);

        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        //sortingStudentsByGPA.sortStudents(studentArrayList);

        studentArrayList.sort(sortingStudentsByGPA);
        System.out.println("Sorted list:\n");
        printStudentsArrayList(studentArrayList);
    }
}

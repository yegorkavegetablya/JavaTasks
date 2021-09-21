package task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getId() > student2.getId()) {
            return 1;
        }
        else if (student1.getId() < student2.getId()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    public void sortStudents(ArrayList<Student> studentArrayList) {
        if (studentArrayList.size() <= 1) {
            return;
        }

        Random random = new Random();
        int supporting_element_number = random.nextInt(studentArrayList.size());
        Student supporting_student = studentArrayList.get(supporting_element_number);

        ArrayList<Student> biggerStudentsId = new ArrayList<Student>();
        ArrayList<Student> smallerStudentsId = new ArrayList<Student>();

        for (Student student : studentArrayList) {
            if (!student.equals(supporting_student)) {
                int comparing_result = this.compare(student, supporting_student);

                if (comparing_result == 1) {
                    biggerStudentsId.add(student);
                }
                else {
                    smallerStudentsId.add(student);
                }
            }
        }

        sortStudents(smallerStudentsId);
        sortStudents(biggerStudentsId);

        studentArrayList.clear();

        studentArrayList.addAll(smallerStudentsId);
        studentArrayList.add(supporting_student);
        studentArrayList.addAll(biggerStudentsId);
    }
}

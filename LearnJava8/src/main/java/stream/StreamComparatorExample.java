package stream;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamComparatorExample {

    //sort the result from student database and print the student in alphabetic order
    public static List<Student> sortStudentByName(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());

    }


    public static List<Student> sortStudentByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(toList());

    }





    public static void main(String[] args) {
        System.out.println("Student sorted by name");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Student sorted by gpa");

        sortStudentByName().forEach(System.out::println);

    }
}

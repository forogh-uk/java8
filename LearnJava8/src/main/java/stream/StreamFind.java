package stream;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFind {

    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                //check one by one in stream
                .findAny();
    }

    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
    Optional<Student> studentFindAny = findAny();
    if (studentFindAny.isPresent()){
        System.out.println("Found a student: " + studentFindAny.get());
    }else{
        System.out.println("Student not find");
    }

    Optional<Student> findFirst = findFirst();
    if(findFirst.isPresent()){
        System.out.println("Find first: " + findFirst);
    }else{
        System.out.println("Student not find");

    }
    }
}

package stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamMapExample {


    public static List<String> studentList(){

        List<String> studentList = StudentDataBase.getAllStudents().stream()
                //map extends function interface
                //map  convert the stream student to stream string
                //function -> stake a type and return types
                //input student
                //output name of students

                .map(Student::getName)
                .map(String::toUpperCase)  //convert string to uppercase
                .collect(toList());
        return studentList;

    }

//set
    public static Set<String> setName(){
        Set<String> studentSet = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(toSet());//collect the set of string
        return studentSet;
    }



    public static void main(String[] args) {
    System.out.println(studentList());
        System.out.println("---------------");
        System.out.println(studentList());


    }
}

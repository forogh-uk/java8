package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoining {
    //concatenate all the name that are part of student database and return as result

    public static String joining1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());

    }

    public static String joining2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));

    }

    public static String joining3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-" , "(" , ")"));
    }




    public static void main(String[] args) {
        System.out.println(joining1());
        System.out.println(joining2());
        System.out.println(joining3());



    }
}

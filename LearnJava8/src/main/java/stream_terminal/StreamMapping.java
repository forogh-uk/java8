package stream_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamMapping {


    public static void main(String[] args) {
       List<String> studentName = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
       System.out.println("Mame list: " + studentName);

       Set<String> studentNameSet = StudentDataBase.getAllStudents()
               .stream()
               .collect(mapping(Student::getName,toSet()));
        System.out.println("Mame set: " + studentNameSet);

        List<String> studentUsingMap=StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(toList());
        System.out.println("using intermediate stream method: " + studentUsingMap);



    }
}

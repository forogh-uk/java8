package stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //list of students and list of activites
        //student as a key and list of activites as a value
        //create a stream
        //use the method call collect
        //collector
        Predicate<Student> studentPredicate = (st -> st.getGradeLevel()>=3);
        Predicate<Student> studentPredicate1 =(st->st.getGpa()>=3.9);
       Map<String, List<String>> studentMap =  StudentDataBase.getAllStudents().stream()

               //peek is extend consumer and for debug , print all value for student
               .peek(student -> {
                   System.out.println(student);
               })
               .filter(studentPredicate)
               .peek(student -> {
                   System.out.println("Filter 1:   " + student);
               })
               .filter(studentPredicate1)
               .peek(student -> {
                   System.out.println("Filter 2: " + student);
               })
               .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentMap);
        
    }
}

package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {
//except 2 input
    //output 1

    //first input list of students
    //second input is predicate as input

    //3 parameters, first 2 are input and last one is output

    //output -> map student and gpa
    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction= ((students, studentPredicate)->{
        Map<String,Double> studentsGrade = new HashMap<>();
        students.forEach(student->{
             if(studentPredicate.test(student)){
                 studentsGrade.put(student.getName(),student.getGpa());
             }
        });
        return studentsGrade;

    });

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudent.p));

    }

}

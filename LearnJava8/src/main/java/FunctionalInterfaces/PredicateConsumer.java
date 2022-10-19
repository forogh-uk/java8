package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateConsumer {
    Predicate<Student> p1 =(student)-> student.getGradeLevel()>=3;
    Predicate<Student> p2=student->student.getGpa()>=3.9;
    BiPredicate<Integer, Double> p3 =(grade,gpa)->grade>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> st = (name, activites)->System.out.println(name +" " +activites);


  Consumer<Student> studentConsumer = (student->{
      if(p1.and(p2).test(student)){
          st.accept(student.getName(),student.getActivities());
      }
  });

    Consumer<Student> studentConsumerBipredicate = (student->{
        if(p3.test(student.getGradeLevel(),student.getGpa())){
            st.accept(student.getName(),student.getActivities());
        }
    });

    public void printListOfStudent(List<Student> Students){
        Students.forEach(studentConsumer);

    }

    public void printListOfStudentBipredicate(List<Student> Students){
        System.out.println("---------");
        Students.forEach(studentConsumerBipredicate);

    }



    public static void main(String[] args) {
        List<Student> student = StudentDataBase.getAllStudents();
        new PredicateConsumer().printListOfStudent(student);
        new PredicateConsumer().printListOfStudentBipredicate(student);


    }
}

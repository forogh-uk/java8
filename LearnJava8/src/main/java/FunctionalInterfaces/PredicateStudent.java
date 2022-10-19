package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudent {
    static Predicate<Student> p =(s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 =(st) ->st.getGpa() >=3.9;

public static void getGrade(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student ->{
        if(p.test(student)){
            System.out.println(student);
                 }
                }
            );
 }

 public static void filterStudentGPA(){
    System.out.println("----------");
    List<Student>  studentList=StudentDataBase.getAllStudents();
    studentList.forEach(s->{
        if(p2.test(s)){
            System.out.println(studentList);
        }
    });
    }

    public static void filterGPAGrade(){
        System.out.println("----------");

        List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(s->{
        if(p.and(p2).test(s)){
            System.out.println(s);
        }
    });
    }





    public static void main(String[] args) {
    getGrade();
  filterStudentGPA();
  filterStudentGPA();

    }
}

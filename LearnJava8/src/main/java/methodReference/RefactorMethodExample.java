package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodExample {

    //static Predicate<Student> p1 =(s)->s.getGradeLevel()>=3;

    //method refernce
    static Predicate<Student> p1 =RefactorMethodExample::graterThanGrade;

    public static boolean graterThanGrade(Student s){
        return s.getGradeLevel()>=3;

    };

    public static void main(String[] args) {
        System.out.println(p1.test(StudentDataBase.studentSupplier.get()));

    }
}

package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> c1=(p)->System.out.println(p);

    //system is a class and print ln the method inside class

    //method refernce: access the method by using out to the class
    static Consumer<Student> c2=System.out::println;

    //classname ::methods inside the class
    static Consumer<Student> student = Student::printListOfActivities;


    public static void main(String[] args) {
       // StudentDataBase.getAllStudents().forEach(c1);
        //StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(student);

    }
}

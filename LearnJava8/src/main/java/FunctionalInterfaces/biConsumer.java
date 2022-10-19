package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class biConsumer {
    //bi consumer except 2 input
    //consumer except one input

    public static void nameAndActivites(){
        BiConsumer<String ,List<String>> biConsumer = (name,activites)->System.out.println(name + "name" +  activites + "activites");
        List<Student> studentList= StudentDataBase.getAllStudents();
        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));

    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a " + a + " b " + b);
        biConsumer.accept("Java" , "java 8");
        BiConsumer<Integer,Integer> multiply =(a,b)->System.out.println(a*b);
        BiConsumer<Integer,Integer> division = (a,b) -> System.out.println("Division:  " + a/b);
        multiply.andThen(division).accept(9,3);
        nameAndActivites();

    }
}

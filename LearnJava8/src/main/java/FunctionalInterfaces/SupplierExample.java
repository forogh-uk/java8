package FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
    //opposite of consumer interface
    //consumer except input but that is void no return no out put
    //supplier, we have no input and output return
    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return new Student("Adam",2,3.6, "male",10, Arrays.asList("swimming", "basketball","volleyball"));
        };
        System.out.println("Student: " + studentSupplier.get());

        System.out.println("-------");
        Supplier<List<Student>> studentList = ()-> StudentDataBase.getAllStudents();
        System.out.println("List of student are "  + studentList.get());

    }
}

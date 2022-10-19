package stream;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
       return integerList.stream()

               // 1 is defualt value
               //1-> defualt value =a
               //1 -> from stream =1
               //a*b=1
               //resualt =1, a=1 b=2 -> resualt =2
               //result =2-> a=2, b=3 -> result =2*3=6
               //result =6 a=6 b=4-> 6*4 =24
                .reduce(1,(a,b) -> a*b);

    }

    public static Optional <Integer> performMultiplicationNoDefualtValue(List<Integer> integerList){
        //use optional to handle the non value
        //use optional to have no defualt value
        return integerList.stream()
                .reduce((a,b) -> a*b);

    }

    public static Optional<Student> getHigherGpa(){
      return   StudentDataBase.getAllStudents().stream()
              //get students one by one
                .reduce((s1,s2) -> {
                    //compare s1 to st
                        if(s1.getGpa()>s2.getGpa()){
                            return s1;

                        }else{
                            return s2;
                        }
                });
    }

    public static Optional<Student> getHigherGpaLessCode(){
        return   StudentDataBase.getAllStudents().stream()
                //get students one by one
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1:s2);
    }



    public static void main(String[] args) {

        //multiplication of all number as a result
        List<Integer> integer = Arrays.asList(1,2,3,4);
        System.out.println(performMultiplication(integer));
        System.out.println("------------------");

        Optional<Integer> result = performMultiplicationNoDefualtValue(integer);
        System.out.println(result);
        System.out.println(result.isPresent());
        System.out.println(result.get());
        Optional<Student> studentOptional= getHigherGpa();
        if(getHigherGpa().isPresent()){
            System.out.println("Get higher GPA: " + studentOptional.get());
        }
        Optional<Student> getHigherGpa2=getHigherGpaLessCode();
        if(getHigherGpa2.isPresent()){
            System.out.println("Get higher GPA with clean code: " + getHigherGpa2.get());
        }



    }
}

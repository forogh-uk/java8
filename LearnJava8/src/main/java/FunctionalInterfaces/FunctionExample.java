package FunctionalInterfaces;

import java.util.Locale;
import java.util.function.Function;

public class FunctionExample {


    // input and out put
    static Function<String,String> function=(name) -> name.toUpperCase();
    static Function<String, String> addSumFunction = (name) -> name.toUpperCase().concat("defult ");




    public static void main(String[] args) {
        System.out.print("result :   " + function.apply("First Example")) ;
        System.out.print("--------");
        System.out.println("Result of sum function :  " + function.andThen(addSumFunction).apply("  java 8   "));
        System.out.print("Execute the second function first: " + function.compose(addSumFunction).apply("Second function   "));
    }
}

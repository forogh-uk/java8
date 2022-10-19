package FunctionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryFunctionExample {
    //extend function interface
    //input string, output string
    //whe we have input and output the same type we can use this unary operator
    static UnaryOperator<String> unaryOperator= (s)->s.concat("Defualt ");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java 8 "));

    }

}

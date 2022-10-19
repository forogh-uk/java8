package methodReference;

import java.util.function.Function;

public class FunctionMethodReference {
    //sting input, sting output
    static Function<String,String> toUpperCaseLambda=(s)->s.toUpperCase();
    //option and enter key to have a short cut

    //method reference
    static Function<String,String> toUpperCaseMethodReference= String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("java 8 "));
        System.out.println("Method refernce: " + toUpperCaseMethodReference.apply("Using method refernce"));

    }
}

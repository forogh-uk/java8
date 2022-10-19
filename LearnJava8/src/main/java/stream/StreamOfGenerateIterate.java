package stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterate {


    public static void main(String[] args) {

        //return type is string
       Stream<String> stringStream = Stream.of("Adam","Dan","Julie");
       stringStream.forEach(System.out::println);
       //iterate() take two input initial value and unary operator
        //unary operator take an input of one type and return output the same type

       Stream.iterate(1,x->x*2)
               //we are using limit otherwise it is run for ever
               .limit(10)
               .forEach(System.out::println);
       //Random()::nextInt create a random number
        Supplier<Integer> integerSupplie=new Random()::nextInt;
        Stream.generate(integerSupplie)

                //if we are not using limit it is run for ever
                .limit(5)
                .forEach(System.out::println);
    }
}

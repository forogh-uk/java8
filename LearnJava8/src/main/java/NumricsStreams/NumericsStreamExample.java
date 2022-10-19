package NumricsStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericsStreamExample {
    //sum of number and return sum as result

    public static int sumOfNumbers(List<Integer> intList){
        return intList.stream()
                .reduce(0,(x,y) -> x+ y);// unboxing to convert integer to int

    }

    public static int sumNumbersUsingInStream(){
        return IntStream.rangeClosed(1,6)
                //1
                //2
                //3
                //4
                //5
                //6

                .sum();
    }




    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6);
        System.out.println("Sum of numbers: " + sumOfNumbers(integerList));
        System.out.println("sum Numbers Using InStream: " + sumNumbersUsingInStream());


    }
}

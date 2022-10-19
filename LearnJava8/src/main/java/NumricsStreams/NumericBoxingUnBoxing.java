package NumricsStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericBoxingUnBoxing {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                .boxed()
                .collect(Collectors.toList());

    }

    public static int unBoxing(List<Integer> integerList){
        //wrapper integer value  =integerList
        //Integer :: intValue  convert Integer to int
        //mapToInt -> intStream back
       return integerList.stream().mapToInt(Integer::intValue) //intStream(int Value of wrapper class)
                .sum();

    }
    public static void main(String[] args) {
        System.out.println("Boxing: " + boxing());
        List<Integer> integerList = boxing();
        System.out.println("Unboxing: " + unBoxing(integerList));

    }
}

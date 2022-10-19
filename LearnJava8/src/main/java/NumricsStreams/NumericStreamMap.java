package NumricsStreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMap {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) ->{
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static Long mapToLong(){
        return IntStream.rangeClosed(1,5)
                //i value is passed from the intStream
                //convert intStream to Longstream
                .mapToLong((i)->i)
                .sum();

    }

    public static Double maptoDouble(){
        return IntStream.rangeClosed(1,5)
                //i is passed from intStream
                //convert intStream to double
                .mapToDouble((i)-> i)
                .sum();
    }


    public static void main(String[] args) {
        System.out.println("Map to Object: " + mapToObj());
        System.out.println("Map to Long: " + mapToLong());
        System.out.println("Map to Double: " + maptoDouble());




    }
}

package NumricsStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRange {

    public static void main(String[] args) {
        IntStream  intStreamExample = IntStream.range(1,50);
        System.out.println(intStreamExample.count());

        IntStream intStreamRangeClose = IntStream.rangeClosed(1,50);
        System.out.println(intStreamRangeClose.count());

        IntStream.range(1,50)
                .forEach(value->System.out.print( value + ","));
        System.out.println();


        IntStream.rangeClosed(1,50)
                .forEach(value->System.out.print( value + ","));

        System.out.println();


        System.out.println("Long Stream Range Closed: " + LongStream.range(1,50).count());
        LongStream.range(1,50)
                .forEach(value-> System.out.print(value+ ","));

        System.out.println();


        System.out.println("Long Stream Range Closed: " + LongStream.rangeClosed(1,50).count());
        LongStream.rangeClosed(1,50)
                .forEach(value-> System.out.print(value+ ","));
        System.out.println();


        IntStream.rangeClosed(1,50).asDoubleStream()
                .forEach(value->System.out.print( value + ","));


    }
}

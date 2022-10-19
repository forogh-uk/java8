package NumricsStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericSumMacMinAvarage {


    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,50)
                .sum();
        System.out.println(sum);

        OptionalInt maxValue =IntStream.rangeClosed(1,50)
                .max();
        if(maxValue.isPresent()) {
            System.out.println("max value is: " + maxValue);
        }else{
            System.out.println("value is empty");

        }
        System.out.println(maxValue.isPresent() ? maxValue.getAsInt() : 0);

        OptionalLong optionalLog = LongStream.rangeClosed(50,100)
                .min();

        System.out.println();
        System.out.println(optionalLog.isPresent() ? optionalLog.getAsLong() : 0);

        System.out.println();

        OptionalDouble optionalDouble = IntStream.rangeClosed(1,50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0);

    }


}

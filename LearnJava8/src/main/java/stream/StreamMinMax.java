package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {
    //create a method to have max and min in the array
    //this is int method becuase return max value as integer
    //becuase the input from main method is list, we have to define List

    public static int maxValue(List<Integer> integerList){
        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                //x value hold the max value for each element in iteration
                //when we start the x value is defualt value which is 0, y =6-> 0>6 no-> return y =6
                //y assign to x now x =6 and y=7
                .reduce(0,(x,y) -> x>y ? x : y);


    }

    public static Optional<Integer> maxValueOptional(List<Integer> integerList){
        return integerList.stream()

                .reduce((x,y) -> x>y ? x : y);


    }

    public static Optional<Integer> minValue(List<Integer> minValue){
        return minValue.stream().reduce((x,y) -> x < y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(6,7,8,9,10);
        int maxValue = maxValue(integerList);

            System.out.println("Max value is: " + maxValue);



       Optional<Integer>  maxValueOptional = maxValueOptional(integerList);
       if(maxValueOptional.isPresent()) {
           System.out.println("Max value using  is: " + maxValueOptional);
       }else{
           System.out.println("No max value");

       }


        Optional<Integer> minValue = minValue(integerList);
        if(minValue.isPresent()) {
            System.out.println("Min value is: " + minValue);
        }else{
            System.out.println("No Min value is");

        }


    }
}

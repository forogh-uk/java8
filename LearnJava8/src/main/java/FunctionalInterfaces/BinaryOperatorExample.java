package FunctionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    //one input, one output , the same type
    //extend bifunction interface
    //min by
    //max by
     static Comparator<Integer> comparator =(a,b)->a.compareTo(b);
    public static void main(String[] args) {
         BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
         System.out.println(binaryOperator.apply(3, 4));
         BinaryOperator<Integer> maxVal = BinaryOperator.maxBy(comparator);
         System.out.println("max value is: " + maxVal.apply(4,5));
         BinaryOperator<Integer> minValue = BinaryOperator.minBy(comparator);
         System.out.println("min value is " + minValue.apply(10,15));


    }
}

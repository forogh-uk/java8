package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOperationLimitSkip {
    public static Optional<Integer> limitValue(List<Integer> integerList){
        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                //limit 2, just read the first 2 elements
                .limit(2)
                .reduce((x,y) -> x+y);

    }

    public static Optional<Integer> skipValue(List<Integer> integerList){
        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                //skip the first 3, just read from 4 elements
                .skip(3)
                .reduce((x,y) -> x+y);

    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitValue= limitValue(integerList);
        if(limitValue.isPresent()){
            System.out.println("A+ B " + limitValue.get());
        }else{
            System.out.println("Is empty");

        }

        Optional<Integer> skipValue= skipValue(integerList);
        if(skipValue.isPresent()){
            System.out.println("A+ B, skip methods :  " + skipValue.get());
        }else{
            System.out.println("Is empty");

        }




    }
}

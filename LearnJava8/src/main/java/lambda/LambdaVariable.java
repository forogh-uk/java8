package lambda;

import java.util.function.Consumer;

public class LambdaVariable {

    //static int value =4;

    public static void main(String[] args) {
        /*
        int i =0;
        Consumer<Integer> c1 = (i1) ->
            int i2 =2;
            System.out.println();

         */

        int value =4;
        Consumer<Integer> c1 = (i) -> {
           // value++;
            System.out.println(value + i);

        };
        c1.accept(4);
        }



}

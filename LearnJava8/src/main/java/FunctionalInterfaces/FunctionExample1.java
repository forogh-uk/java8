package FunctionalInterfaces;

public class FunctionExample1 {

    public static String test(String str){
       return FunctionExample.addSumFunction.apply(str);
    }

    public static void main(String[] args) {
        String result = test("hello " );
        System.out.println(result);

    }
}

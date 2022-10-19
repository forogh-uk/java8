package FunctionalInterfaces;

import java.util.function.Predicate;

public class PridicateExample {
    //return boolen
    //nagate opration reverse the result
    static Predicate<Integer> p =(i) ->  i%2==0;
    static Predicate<Integer> p2 =(i) -> i%5 ==0;

    public static void predicateAnd(){
        System.out.println("predicate p and p1 :  " + p.and(p2).test(10));

    }

    public static void predicateOr(){
        System.out.println("predicate p or p1 for 10  :  " + p.or(p2).test(10));
        System.out.println("predicate p or p1 for 9  :  " + p.or(p2).test(9));


    }

    public static void predicateNegate(){
        //p.or(p2) is going to ture, then negate change it to false
        System.out.println("predicate p or p1 for 8 negate  :  " + p.or(p2).negate().test(8));



    }
    public static void main(String[] args) {
        //create a predicate int == even or not

        System.out.println(p.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }

}

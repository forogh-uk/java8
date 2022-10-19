package stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionVsStream {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("Jim");
        names.add("jenny");
        names.remove(0);
        System.out.println(names);
        System.out.println("------");

        Stream<String> nameStream =names.stream();
        nameStream.forEach(System.out::println);




    }
}

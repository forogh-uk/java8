package stream_terminal;

import data.StudentDataBase;

import static java.util.stream.Collectors.counting;

public class StreamsCounting {

    public static long count1(){
        return StudentDataBase.getAllStudents().stream()

                .collect(counting());
    }

    public static long count2(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .collect(counting());
    }
    public static void main(String[] args) {
        System.out.println("Count all student " + count1());
        System.out.println("Count student gpa > = 3.9 is: " + count2());


    }
}

package stream;

import data.StudentDataBase;

public class StreamsMatch {

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >=3.5);
    }

    public static boolean anyMatch(){
        //any match
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.00);

    }
    public static boolean nonematch(){
       return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>=4.0);
    }



    public static void main(String[] args) {

        System.out.println("All match :" + allMatch());
        System.out.println("Any match :" + anyMatch());
        System.out.println("none match :" + anyMatch());

    }
}

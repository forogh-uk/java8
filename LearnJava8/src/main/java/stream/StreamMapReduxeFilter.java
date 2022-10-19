package stream;

import data.Student;
import data.StudentDataBase;

public class StreamMapReduxeFilter {
    //add additional one parameters student object
    //total of notebook
    private static int noOfStudent(){
        return StudentDataBase.getAllStudents().stream()
                //get student grade >=3
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0,(a,b)->a+b);

    }


    public static void main(String[] args) {
        System.out.println(noOfStudent());

    }
}

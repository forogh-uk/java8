package stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class FlatMap {

    //print all activites
    public static List<String> printStudentActivities(){
       List<String> studentActivities =
                StudentDataBase.getAllStudents().stream()
                        //becuase we convert the list to map, and map is take one value, we have to use flatmap
                .map(Student::getActivities)//stream list<string>
                         .flatMap(List::stream)
                        //unique activities

                        .distinct()
                        //sorted alphabticly
                        .sorted()
                .collect(toList());

            return studentActivities;
    }


    //total number of activites supported by database or schools

    public static Long printStudentActivitieCounts(){
        Long studentActivitiesCount =
                StudentDataBase.getAllStudents().stream()
                        //becuase we convert the list to map, and map is take one value, we have to use flatmap
                        .map(Student::getActivities)//stream list<string>
                        .flatMap(List::stream)
                        //unique activities
                        .distinct()
                        //total number of activites supported by datav=base or schools
                        .count();

        return studentActivitiesCount;
    }


    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(printStudentActivitieCounts());

    }
}

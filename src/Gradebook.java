import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Engineer on 5/30/2017.
 */
public class Gradebook {

    public static void main(String [] args){
        List<String> students=new ArrayList<>();
        List<Double> grades=new ArrayList<>();
        Scanner in= new Scanner(System.in);
        String newStudent;

        //get student names and grades
        System.out.println("Enter your students(or press ENTER to finish)");
        do{
            newStudent=in.nextLine();
            if(!newStudent.equals("")){
                students.add(newStudent);
            }


        }

        while(!newStudent.equals(""));

        for (String student:students){
            System.out.println("Grade for "+student+":");
            Double grade=in.nextDouble();
            grades.add(grade);
        }

        //print class roster

        System.out.print(System.lineSeparator()+"Class Roster");
        double sum=0.0;
        for (int i=0;i<students.size();i++){
            System.out.println(students.get(i)+"("+grades.get(i)+")");
            sum+=grades.get(i);
        }
        double avg=sum/students.size();
        System.out.println("Average:"+avg);

    }
}

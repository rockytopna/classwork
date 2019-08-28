package quiz;

//create a program which will
// - take a specific number of student name from the console
// - for each student, it should ask for 4 subjects name and marks for them all
// - your code should get the avg marks & total for the each of the students
// - store all the students name, marks, subjects in individual ArrayList/Hashset and print all subjects, students name from that

//Tips : You may want to use Scanner, ArrayList, HashSet/ArrayList
//Your code needs to by dynamic enough to handle as many numbers of student user may want to.
//Think Smartly !

import java.util.Scanner;
import javax.naming.Name;
import java.util.ArrayList;

public class Exam {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student you want to calculate ? ");
        int count = scanner.nextInt();
        String myArray[] = new String[count];

        for (int i = 0; i < count; i++) {
            myArray[i] = scanner.nextLine();
            ArrayList studentList = new ArrayList();
            System.out.println("Enter Student Name: ");
            myArray[i] = scanner.nextLine();
        }

        Scanner scanner1 = new Scanner(System.in);
        ArrayList subjectList = new ArrayList();

       // String MyArray[] = new String[4];

        for (int list = 0; list < 4; list++) {
            System.out.println("Subject List: ");
            String count1 = scanner.next();
            subjectList.add(count1);
            //myArray[list] = scanner1.nextLine();
        }
        ArrayList <Integer> scoreList = new ArrayList();

        for (int score = 0; score < 4; score++) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Student score: ");
            int count2 = scanner2.nextInt();
            scoreList.add(count2);
            //String MyScore[] = new String[count2];
            // System.out.println("Avg: ");
        }

        int sum=0;



        for (int i = 0; i< 4;i++){
            sum=sum+scoreList.get(i);



        }
               int avg= sum/4;
        System.out.println("Avg: "+ avg);




        }


    }
























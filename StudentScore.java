package CodSoft;

import java.util.*;
public class StudentScore {

    public static int sumOf(int[] marks,int numOfSubjects){

        int sum = 0 ;
        for( int j = 0 ; j < numOfSubjects ; j++ ){
            sum = sum + marks[j];
        }
        return sum;
    }
    public static int avg(int totalMarks ,int numOfSubjects){
        int avg = totalMarks/numOfSubjects;
        return avg ;
    }
    public static void calculateGrade(int avg){
        if( avg >= 90 && avg <= 100 ){
            System.out.println("You Passed with Grade A"+" ");
        }
        else if(avg>=75 && avg<90){
            System.out.println("You Passed with Grade B"+" ");
        }  
        else if(avg>=60 && avg<75){
            System.out.println("You Passed with Grade C"+" ");
        }
        else if(avg>=50 && avg<60){
            System.out.println("You Passed with Grade D"+" ");
        }
        else if(avg<33 && avg>0){
            System.out.println("You are failed !"+" ");
        }
        
    }
    public static void main(String args[]){
        System.out.println("Enter Your Total Subject"+" ");
        Scanner sc = new Scanner(System.in);
        int numOfSubjects = sc.nextInt();
        System.out.println("Enter your Marks of Each Subject"+" ");
        int marks[] = new int[numOfSubjects];
       
        for( int i = 0 ; i < numOfSubjects ; i++ ){
            marks[i]=sc.nextInt();   

        }
       int totalMarks = sumOf(marks, numOfSubjects);
       System.out.print("Your Total Marks Are"+" ");
       System.out.println(totalMarks+" ");
       int avg = avg(totalMarks,numOfSubjects);
       System.out.print("Your Average Percentage is "+" ");
       System.out.println( avg + "%");
       calculateGrade(avg);
       sc.close();
    }
}
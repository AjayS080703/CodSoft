package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame{

    public static int randomNum(){
        int computerNum;
        Random random = new Random();
        System.out.println("How Many Attempts do You Want ?");
        computerNum = random.nextInt(100)+1;
        return computerNum;
    }

    public static int takeUserInput(){
        int userNum;
        System.out.println("Guess a Number");
       Scanner sc = new Scanner(System.in);
        userNum = sc.nextInt();
        return userNum;
       
    } 
   
    public static int playGame(){
        int userNum,computerNum;
        int attempt = 0 ;
        computerNum = randomNum();
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        for( int i = 0 ; i<limit ; i++ ){
            userNum = takeUserInput();
          
            if( userNum == computerNum ){
                System.out.println("Congratulations You Won The Game");
                attempt++;
                return attempt;
            }
            else if(userNum>computerNum){
                System.out.println("Your Number is Too High , Try Again" );
            }
           
            else {
                System.out.println("You Number is Too Low , Try Again");
            }
            if (limit <= 0) {
                System.out.println("Invalid number of attempts , Please restart the game and try again");
                return -1 ;
            }
                attempt++ ;

        }       
        System.out.println("Sorry , You Are Failed! Better Luck Next Time !");
        System.out.println("Sorry You've Used All The Attempts"  + "The Correct Number Was :"+" "+computerNum+" ");    
        return attempt ;
        
    }
    public static void main(String args[]){
        int attempt = playGame();
        System.out.println("You Completed the Game in"+" "+ attempt +" Attempts"); 
    }
}
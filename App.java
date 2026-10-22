//project of Programming 1
package app;
import java.util.Scanner;
import java.util.Random;

/*
 * Students names :-
 * 1- Sahar Hawsawi
 * 2- Sadeem Al-Raiqi
 * 3- Ghala Al-Qurashi
 * IDs:
 * 1- Sahar : 446002564
 * 2- Sadeem : 446002579
 * 3- Ghala : 446002698
 * Group: 15
 */

public class App {

    public static final String PROGRAM = "Simple Operations Program";
   
    public static void generateIncrementalOutput(int start, int end){
        Scanner scanner = new Scanner(System.in);
        while (start >= end){
            System.out.println("ERROR: the first integer should be smaller than the second integer.");
            System.out.println("Please ensure that the second number is larger than the first number.");
            start = scanner.nextInt();
            end = scanner.nextInt();
        }
        for (int i = start; i <= end; i+=5 ){
            System.out.println(i+ " ");  
        }
    }       
    //End of generateIncrementalOutput Method
    
    public static boolean guessingNumber(int number) {
    Random rng = new Random();
    int randomNumber = rng.nextInt(100)+1;
    
    if(number == randomNumber){
        System.out.println("congratulation!");
        return true;
    } else if (number < randomNumber){
        System.out.println("Too low !");
    return false;
    } else {
        System.out.println("Too high");
        return false;
    }
   }    
   
    //End of guessingNumber Method

    public static void main(String[] args) {

      System.out.println(PROGRAM);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two numbers (start and end).");
        System.out.println("Please ensure that the second number is larger than the first number.");
        int start = s.nextInt();
        int end = s.nextInt();
        generateIncrementalOutput(start, end);
        System.out.println("Enter a number between 1 and 100:");
        int number = s.nextInt();
        guessingNumber(number);
              
    }
}

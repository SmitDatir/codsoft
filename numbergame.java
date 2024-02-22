
import java.util.Random;
import java.util.Scanner;

public class numbergame{
    
    public static void main( String args[]){
   Random rc = new Random();
   int anynumber = rc.nextInt(101);
   //System.out.println("Random number is : "+anynumber); if you want to know the random number that is too be guessed
   @SuppressWarnings("resource")
   
  Scanner scan = new Scanner(System.in);
   while(true) { 
	   
   System.out.println("Enter the number between 1 to 100 that you want ot guess:- ");
       int numberentered = scan.nextInt();
      
       if (numberentered == anynumber){
         System.out.println("You have guessed the right number. Congrats!!!");
         break;
       }
        else if(numberentered > anynumber){
            System.out.println("You have not guessed the right number. Your number is too high. Guess it again");
        }
        else if(numberentered < anynumber){
            System.out.println("You have not gussed the right number. Your number is too low. Guess it again");
        }
       
    }
}
}



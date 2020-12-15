import java.util.Random;
import java.util.Scanner;

public class section6_30{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    intro();
    int guessmynumber = setrandomNum();
    System.out.println("\n\nComputer: 'Haha! You'll never guess my number!'");
    System.out.print("Your Guess: ");
    int userGuess = uInp.nextInt();
    do{
      if(userGuess > guessmynumber)
        System.out.println("Too high, try again!");
      else if(userGuess < guessmynumber)
        System.out.println("Too low, try again!");
      else
        break;
      System.out.print("Your Guess: ");
      userGuess = uInp.nextInt();
    }while(userGuess != guessmynumber);
    System.out.println("\nCongratulations, you guessed the number!");
  }
  public static int setrandomNum(){
    Random rand = new Random();
    int compNum = rand.nextInt(1000);  //get the computer to choose a random number between 0 and 1000

    return compNum;
  }
  public static void intro(){
    System.out.println("\n\nWelcome to 'GUESS THAT NUMBER!' where you need to...\nThats right, guess that number...");
    System.out.println("\nHere are the rules!");
    System.out.println("(1) The computer will pick a number between 0 and 1000");
    System.out.println("(2) Your job is to guess that number");
    System.out.println("(3) The computer will 'guide' you (kinda...)");
    System.out.println("\nGood luck!!");
  }
}

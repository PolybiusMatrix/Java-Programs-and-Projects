import java.util.Scanner;
import java.util.Random;

public class section6_29{
  public enum Coin{
    Heads,
    Tails
  }

  public static Coin coin; //create an enumerated object of type Coin
  public static int headCount = 0;
  public static int tailsCount = 0;

  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    char menuChoice;
    Menu();
    System.out.print("> ");
    menuChoice = uInp.next().charAt(0);
    do{
      //System.out.printf("\nYou entered '%s' %n", menuChoice);
      if(menuChoice == 'T' || menuChoice == 't'){
        flipTheCoin();
        whatsideisup();
      }
      else if(menuChoice == 'M' || menuChoice == 'm')
        Menu();
      else if(menuChoice == 'X' || menuChoice == 'x')
        break;
      System.out.print("> ");
      menuChoice = uInp.next().charAt(0); //Most things are converted to strings so this is necessary to capture a char
    }while(properInput(menuChoice) == true);


    System.out.println("\nHere are the scores!");
    System.out.printf("Heads: %d times!\n", headCount);
    System.out.printf("Tails: %d times!\n", tailsCount);
  }

  public static int flipTheCoin(){ //random generated number to determine the enumeration
    Random rand = new Random();  //two sides of the coin
    int coinSide = rand.nextInt(2);
    //System.out.printf("%n%d%n", coinSide); //0 = heads 1 = tails
    if(coinSide == 0){
      coin = coin.Heads;
      headCount++;
      return headCount;
    }
    else{
      coin = coin.Tails;
      tailsCount++;
      return tailsCount;
    }
  }

  public static void Menu(){
    System.out.print("T - Toss Coin\n");
    System.out.print("M - Print menu to screen\n");
    System.out.println("X - Exit Program");
  }
  public static void whatsideisup(){
      System.out.print("The coin landed on ");
      System.out.println(coin);
  }
  public static boolean properInput(char uInp){
    if(uInp == 'T' || uInp == 'M' || uInp == 'X' || uInp == 't' || uInp == 'm' || uInp == 'x'){
      //System.out.println("This is a correct Input!");
      return true;
    }
    else{
      System.out.println("\nIncorrect Menu option. Terminating Program.");
      //System.out.println("This is an incorrect Input!");
      return false;
    }
  }
}

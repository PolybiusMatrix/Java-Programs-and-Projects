import java.util.Scanner;

public class Excercise14_9{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    String example1 = "This is the first example.";
    System.out.println("This is the first example.");
    System.out.print("Enter your String: ");
    String userInput = uInp.nextLine();
    String[] tokens = example1.split(" ");
    String[] tokens1 = userInput.split(" ");
    for(int i = tokens.length-1; i >= 0; --i)
      System.out.print(tokens[i] + " ");
    System.out.println();
    for(int i = tokens1.length-1; i >= 0; --i)
      System.out.print(tokens1[i] + " ");
    System.out.println();
  }
}

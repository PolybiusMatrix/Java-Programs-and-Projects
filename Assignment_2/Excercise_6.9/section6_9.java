import java.util.Scanner;

public class section6_9{
  public static void main(String[] args){
    Scanner uInp =  new Scanner(System.in);

    System.out.print("Please enter a double: ");
    double OG = uInp.nextDouble();
    double round = Math.floor(OG);
    System.out.printf("Original Value: %.2f\n", OG);
    System.out.printf("Rounded value: %.2f\n", round);
  }
}

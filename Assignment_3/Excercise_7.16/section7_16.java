import java.util.Scanner;

public class section7_16{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    double total = 0.0;

    for(String doubles : args){
      double userCapture = Double.parseDouble(doubles);
      total += userCapture;
    }
    System.out.printf("The total sum of doubles is: %.2f%n", total);
  }
}

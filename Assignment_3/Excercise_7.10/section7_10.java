import java.util.Scanner;

public class section7_10{
  public static void main(String[] args){
    int[] salesArray = {5000, 7000, 5500, 10500, 2000, 4000, 4500, 8000, 11000, 6000};
    System.out.printf("%s%8s%8s%n", "Index", "Sales", "Total");

    for(int counter = 0; counter < salesArray.length; counter++){
      double total = (salesArray[counter] * .09) + 200;

      System.out.printf("%5d%8d\t%.2f%n", counter, salesArray[counter], total);
    }
  }
}

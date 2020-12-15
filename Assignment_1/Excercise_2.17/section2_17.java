import java.util.Scanner;

public class section2_17{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);

    System.out.println("Please enter 3 integers.");
    //Capture first integer
    System.out.print("> ");
    int number1 = uInp.nextInt();
    //Capture second integer
    System.out.print("> ");
    int number2 = uInp.nextInt();
    //Capture third integer
    System.out.print("> ");
    int number3 = uInp.nextInt();

    int sum = number1 + number2 + number3;
    int product = number1 * number2 * number3;
    int average = (number1 + number2 + number3) / 3;

    System.out.printf("Sum: %d%n", sum);
    System.out.printf("Product: %d%n", product);
    System.out.printf("Average: %d%n", average);

    if(number1 < number2 && number1 < number3)
      System.out.printf("%d is the smallest number of the 3", number1);
    else if(number2 < number1 && number2 < number3)
      System.out.printf("%n%d is the smallest number of the 3", number2);
    else
      System.out.printf("%n%d is the smallest number of the 3", number3);

    if(number1 > number2 && number1 > number3)
      System.out.printf("%n%d is the largest number of the 3", number1);
    else if(number2 > number1 && number2 > number3)
      System.out.printf("%n%d is the largest number of the 3", number2);
    else
      System.out.printf("%n%d is the largest number of the 3", number3);
  }
}

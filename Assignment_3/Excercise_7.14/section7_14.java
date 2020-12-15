import java.util.Scanner;

public class section7_14{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    System.out.println("You will enter a series of 5 numbers total");
    System.out.println("The values will be passed into the function in varying sizes.");
    System.out.print("Value #1: ");
    int val1 = uInp.nextInt();
    System.out.print("Value #2: ");
    int val2 = uInp.nextInt();
    System.out.print("Value #3: ");
    int val3 = uInp.nextInt();
    System.out.print("Value #4: ");
    int val4 = uInp.nextInt();
    System.out.print("Value #5: ");
    int val5 = uInp.nextInt();


    System.out.printf("Product of val1 and val2: %d\n", product(val1, val2));
    System.out.printf("Product of val1, val2, and val3: %d\n", product(val1, val2, val3));
    System.out.printf("Product of val1, val2, val3, and val4: %d\n", product(val1, val2, val3, val4));
    System.out.printf("Product of val1, val2, val3, val4, and val5: %d\n", product(val1, val2, val3, val4, val5));
    }
  public static int product(int...num){
    int product = 1;
    for(int val:num)
      product *= val;

    return product;
  }
}

import java.util.Scanner;

public class section7_15{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    int[] nArr = new int[0]; //initialize an empty array
    int[] voidCatch = new int[10];

    int arrSize = uInp.nextInt();
    int[] userCapture = new int[arrSize];

    if(arrSize <= 0)
      nArr = voidCatch;
    else
      nArr = userCapture;

    int i;
    System.out.printf("%s%8s%n", "Index", "Value");
    for(i = 0; i < nArr.length; i++){
      nArr[i] = 0;
      System.out.printf("%5d%8d%n", i, nArr[i]);
    }
  }
}

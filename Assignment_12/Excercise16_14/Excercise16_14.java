import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Excercise16_14{
  public static void main(String[] args){
    Random rand = new Random();
    LinkedList<Integer> list = new LinkedList<Integer>();

    for(int i = 0; i < 25; i++){
      int randValue = rand.nextInt(100);
      list.add(randValue);
    }
    System.out.println(list);
    System.out.println("The LinkedList will now be Sorted!");
    Collections.sort(list);
    System.out.println(list);
  }
}

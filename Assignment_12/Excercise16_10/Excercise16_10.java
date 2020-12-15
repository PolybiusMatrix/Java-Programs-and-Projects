import java.util.HashSet;
import java.util.Scanner;
import java.lang.Character;

public class Excercise16_10{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    HashSet<String> nameSet = new HashSet<String>();
    String userName;
    String searchedName;
    int menuInp;

do{
    printMenu();
    System.out.print("> ");
    menuInp = Integer.parseInt(uInp.nextLine()); //needed to flush the newline character

    if(menuInp == 1){
      System.out.print("\nEnter Name: ");
      userName = uInp.nextLine();
      nameSet.add(userName);
    }
    else if(menuInp == 2){
      System.out.print("\nEnter name to search: ");
      searchedName = uInp.nextLine();
      if(nameSet.contains(searchedName))
        System.out.printf("\nThe HashSet DOES contain the name %s.%n", searchedName);
      else
        System.out.printf("\nThe HashSet DOES NOT contain the name %s.%n", searchedName);
    }
    else if(menuInp == 3)
      break;
    else if(menuInp != 1 || menuInp != 2 || menuInp != 3){
        do{
          System.out.println("Incorrect menu option. Try again.");
          System.out.print("> ");
          menuInp = Integer.parseInt(uInp.nextLine());

        }while(menuInp != 1 || menuInp != 2 || menuInp != 3);
      }
  }while(menuInp != 3);
}
  public static void printMenu(){
    System.out.println("1 - Add Name to Set");
    System.out.println("2 - Search Name");
    System.out.println("3 - Terminate Program");
    System.out.println("----------------------");
  }
}

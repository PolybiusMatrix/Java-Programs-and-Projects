// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point number
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
      Account account1 = new Account("Jane Green");
      Account account2 = new Account("John Blue");


// display initial balance of each object
displayAccount(account1);
displayAccount(account2);

// create a Scanner to obtain input from t
Scanner input = new Scanner(System.in);

System.out.print("Enter deposit amount for double: ");
double depositAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account depositAmount\n", depositAmount);
account1.deposit(depositAmount);

// display balances
displayAccount(account1);
displayAccount(account2);

System.out.print("Enter deposit amount for double: ");
depositAmount = input.nextDouble();
System.out.printf("%nadding %.2f to account depositAmount\n", depositAmount);
account2.deposit(depositAmount);

// display balances
displayAccount(account1);
displayAccount(account2);
 }
    public static void displayAccount(Account acc){
      System.out.printf("%s balance: $%.2f%n", acc.getName(), acc.getBalance());
    }
}

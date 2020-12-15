import java.util.Scanner;

public class InvoiceTest{
  public static void main(String[] args){
    Scanner uInp = new Scanner(System.in);
    Invoice myInvoice = new Invoice();


    System.out.println("\t---Welcome to the InvoiceTest Store---\n");
    System.out.print("Please enter the item number: ");
    String itemNo = uInp.nextLine();  //read in the item number as STRING
    myInvoice.setNumber(itemNo);

    System.out.println("\nPlease enter a description of the item");
    System.out.print("> ");
    String itemDesc = uInp.nextLine();
    myInvoice.setDescription(itemDesc);

    System.out.print("\nHow many of this item would you like to purchase?: ");
    int itemQuant = uInp.nextInt();
    myInvoice.setQuantity(itemQuant);

    System.out.print("\nWhat is the price of the item?: $");
    double itemPrice = uInp.nextDouble();
    myInvoice.setPrice(itemPrice);

    System.out.println("\n\n\tCalculated Invoice");
    System.out.println("\t__________________\n\n");

    System.out.printf("Item #: %s%n", myInvoice.getNumber());
    System.out.printf("Description of item: %s%n", myInvoice.getDescription());
    System.out.printf("Quantity: %d%n", myInvoice.getQuantity());
    System.out.printf("Price: $%.2f", myInvoice.getPrice());

    System.out.println("\n________________________");
    System.out.printf("Total: $%.2f\n", myInvoice.getInvoiceAmount(myInvoice.getQuantity(), myInvoice.getPrice()));
  }
}

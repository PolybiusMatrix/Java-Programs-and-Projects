import java.util.Scanner;

public class Invoice{
  private String number;
  private String description;
  private int quantity;
  private double price;

  public String getNumber(){
    return number;
  }

  public String getDescription(){
    return description;
  }

  public int getQuantity(){
    return quantity;
  }

  public double getPrice(){
    return price;
  }

  public void setNumber(String number){
    this.number = number;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  public void setPrice(double price){
    this.price = price;
  }

  public double getInvoiceAmount(int quantity, double price){
    double total;
    if(quantity < 0)
      quantity = 0;
    if(price < 0)
      price = 0.0;
    total = quantity * price;

    return total;
  }
}

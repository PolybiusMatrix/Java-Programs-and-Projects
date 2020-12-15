// Fig. 3.8: Account.java
// Account class with a double instance variable
//and deposit method that perform validation.

public class Account {
private String name; // instance variable
private double balance; // instance variable

// Account constructor that receives two para public
Account(String name) {

  this.name = name; // assign name to instan

   // validate that the balance is greater th
   // instance variable balance keeps its def balance and a construct meters

   if (balance > 0.0) { // if the balance is
     this.balance = balance;
   }
 }
// method that deposits (adds) only a valid a
public void deposit(double depositAmount) {
  if (depositAmount > 0.0) {
  balance = balance + depositAmount;
  }
}
// method returns the account balance
public double getBalance() {
  return balance;
}

// method that sets the name
public void setName(String name) {
this.name = name;
}

// method that returns the name
public String getName() {
 return name;
  }
}

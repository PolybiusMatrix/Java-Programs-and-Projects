// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
import java.util.Calendar;


public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects
      SalariedEmployee salariedEmployee =
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00, new Date(10, 21, 1998));
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40, new Date(5, 10, 1967));
      CommissionEmployee commissionEmployee =
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333", 10000, .06, new Date(5, 30, 1998));
      PieceWorker PieceWorker =
         new PieceWorker(
         "Bob", "Lewis", "444-44-4444", new Date(6, 13, 2005), 12.50, 72);

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n",
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         PieceWorker,
         "earned", PieceWorker.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[4];

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee;
      employees[3] = PieceWorker;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString


         if (currentEmployee.getbirthDate().getMonth() ==  Calendar.getInstance().get(Calendar.MONTH) + 1) {
                    System.out.printf(
                       "earned $%,.2f%n%n", currentEmployee.earnings());
                    System.out.printf("IT'S YOUR BIRTH MONTH. ENJOY THIS EXTRA $100!!\n Total + bonus = $%.2f%n%n", currentEmployee.earnings() + 100);
         }
         else
          System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());

      }

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {
         System.out.printf("Employee %d is a %s%n", j,
            employees[j].getClass().getName());
      }
   }
}


/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

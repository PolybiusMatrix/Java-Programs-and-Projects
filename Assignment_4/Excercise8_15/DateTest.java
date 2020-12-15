public class DateTest{
  public static void main(String[] args){
    Date d1 = new Date(12, 31, 1999);
    Date d2 = new Date("December", 31, 1999);
    Date d3 = new Date(365, 1999);


    System.out.println(d1.printDate1());
    System.out.println(d2.printDate2());
    System.out.println(d3.printDate3());
  }
}

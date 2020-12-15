public class DateTest{
  public static void main(String[] args){
    Date d1 = new Date(1, 1, 1);
    Date d2 = new Date(2, 27, 1998);
    Date d3 = new Date(12, 31, 1999);

    for(int i = 0; i < 10; i++){
      d1.nextDay();
      //d2.nextDay();
      //d3.nextDay();

      System.out.println(d1.toString());
      //System.out.println(d2.toString());
      //System.out.println(d3.toString());
    }
  }
}

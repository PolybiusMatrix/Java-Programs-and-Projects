public class DateAndTimeTest{
  public static void main(String[] args){
    DateAndTime dnt1 = new DateAndTime(12, 21, 1998, 21, 21, 57);
    for(int i = 0; i < 10; i++){
      dnt1.incrementHour();
      System.out.println(dnt1.allString());
    }
  }
}

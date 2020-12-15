public class Date{
  private int day, month, year;
  private String mo;
  public Date(int month, int day, int year){
    this.month = month;
    this.day = day;
    this.year = year;
  }
  public Date(String mo, int day, int year){
    this.mo = mo;
    this.day = day;
    this.year = year;
  }
  public Date(int day, int year){
    this.day = day;
    this.year = year;
  }

  public String printDate1(){ //for the first type of date
    return String.format("%d/%d/%d", month, day, year);
  }

  public String printDate2(){
    return String.format("%s %d, %d", mo, day, year);
  }

  public String printDate3(){
    return String.format("%d %d", day, year);
  }
}

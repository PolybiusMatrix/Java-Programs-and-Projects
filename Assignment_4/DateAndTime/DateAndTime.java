public class DateAndTime{

  private int month; // 1-12
  private int day; // 1-31 based on month
  private int year; // any year
  private int hour; // 0 - 23
  private int minute; // 0 - 59
  private int second; // 0 - 59
  private int onlySeconds;

  public String allString(){
    return String.format("%d/%d/%d - %02d:%02d:%02d",
      month, day, year, getHour(), getMinute(), getSecond());
  }

  private static final int[] daysPerMonth =
     {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  // constructor: confirm proper value for month and day given the year
  public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
     // check if month in range
     if (month <= 0 || month > 12) {
        throw new IllegalArgumentException(
           "month (" + month + ") must be 1-12");
     }

     // check if day in range for month
     if (day <= 0 ||
        (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
        throw new IllegalArgumentException("day (" + day +
           ") out-of-range for the specified month and year");
     }

     // check for leap year if month is 2 and day is 29
     if (month == 2 && day == 29 && !(year % 400 == 0 ||
          (year % 4 == 0 && year % 100 != 0))) {
        throw new IllegalArgumentException("day (" + day +
           ") out-of-range for the specified month and year");
     }

     if(year < 0){
       throw new IllegalArgumentException("year (" + year + ") beyond boundries allowed (< 0 || > MAX_VALUE)");
     }
       if (hour < 0 || hour >= 24) {
          throw new IllegalArgumentException("hour must be 0-23");
       }

       if (minute < 0 || minute >= 60) {
          throw new IllegalArgumentException("minute must be 0-59");
       }

       if (second < 0 || second >= 60) {
          throw new IllegalArgumentException("second must be 0-59");
       }

       this.onlySeconds += (((hour * 60 + minute) * 60) + second);

       this.hour = hour;
       this.minute = minute;
       this.second = second;

     this.month = month;
     this.day = day;
     this.year = year;

     System.out.printf("Date object constructor for date %s%n", this);
  }

  public void nextDay(){
    if(day > daysPerMonth[month] && !(month == 2 && day == 29))
     day += 1;
    else if(day >= daysPerMonth[month])
      nextMonth();
     else
       day += 1;
    }

   private void nextMonth(){
     if(month == 12)
       nextYear();
     else{
       month += 1;
       day = 1;
     }
   }

   private void nextYear(){
     year += 1;
     month = 1;
     day = 1;
   }

   // Time2 constructor: another Time2 object supplied

   // Set Methods
   // set a new time value using universal time;
   // validate the data
   public void setTime(int hour, int minute, int second) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.hour = hour;
      this.minute = minute;
      this.second = second;

   }

   // validate and set hour
   public void setHour(int hour) {
      if (hour < 0 || hour >= 24) {
         throw new IllegalArgumentException("hour must be 0-23");
      }

      this.hour = hour;
   }

   // validate and set minute
   public void setMinute(int minute) {
      if (minute < 0 || minute >= 60) {
         throw new IllegalArgumentException("minute must be 0-59");
      }

      this.minute = minute;
   }

   // validate and set second
   public void setSecond(int second) {
      if (second < 0 || second >= 60) {
         throw new IllegalArgumentException("second must be 0-59");
      }

      this.second = second;
   }

   // Get Methods
   // get hour value
   public int getHour() {return hour;}

   // get minute value
   public int getMinute() {return minute;}

   // get second value
   public int getSecond() {return second;}

   // convert to String in universal-time format (HH:MM:SS)
   public String toUniversalString() {
      return String.format(
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
   }

   // convert to String in standard-time format (H:MM:SS AM or PM)
   public String toString() {
      return String.format("%d:%02d:%02d %s",
         ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
         getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
   }

   public void tick(){
     if(this.second == 59){
      this.second = 0;
      incrementMinute();
    }
    else
     this.second++;

    this.onlySeconds++;
   }

   public void incrementMinute(){
     if(this.minute == 59){
       this.minute = 0;
       incrementHour();
     }
     else
      this.minute++;

    this.onlySeconds += 60;
   }

   public void incrementHour(){
     if(this.hour == 23){
       this.hour = 0;
       this.onlySeconds -= 86400;
       nextDay();
     }
     else
      this.hour++;
   }
}

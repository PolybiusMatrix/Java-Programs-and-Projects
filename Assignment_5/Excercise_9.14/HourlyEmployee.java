public class HourlyEmployee extends Employee{
  private double hours; //hours worked
  private double wage;  //hourly wage
  private double totalEarnings;

  public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage){
    super(firstName, lastName, socialSecurityNumber);
    if(hours < 0.0 || hours > 168)
      throw new IllegalArgumentException("Hours must be greater than or equal to 0");
    if(wage < 0.0)
      throw new IllegalArgumentException("People don't pay you to work for you... smdh");

    this.hours = hours;
    this.wage = wage;
    }

    public double getHours(){return hours;}
    public double getWage(){return wage;}

    public void setHours(double hours){
      if(hours < 0.0 || hours > 168)
        throw new IllegalArgumentException("Hours must be greater than or equal to 0");

      this.hours = hours;
    }

    public void setWage(double wage){
      if(wage < 0.0)
        throw new IllegalArgumentException("People don't pay you to work for you... smdh");

      this.wage = wage;
    }

    public double earnings(){
      if(this.hours > 40)
        totalEarnings = (this.wage * 40) + ((this.wage * 1.5) * (this.hours - 40));
      else
        totalEarnings = this.wage * 40;

      return totalEarnings;
    }

    @Override
    public String toString(){
      super.toString();
      return String.format("Total Hours: %s%n Total Earnings: $%.2f%n", hours, this.earnings());
    }
}

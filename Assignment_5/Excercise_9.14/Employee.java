public class Employee{
  protected String firstName, lastName;
  protected String socialSecurityNumber;

  public Employee(String firstName, String lastName, String socialSecurityNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
  }

  public String getFirstName(){return firstName;}
  public String getLastName(){return lastName;}
  public String getSocialSecurityNumber(){return socialSecurityNumber;}

  public String toString(){
    return String.format("Name: %s %s%n Social Security #: %s", firstName, lastName, socialSecurityNumber);
  }
}

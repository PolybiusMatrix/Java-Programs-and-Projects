public class PieceWorker extends Employee{
  private double wage;
  private int pieces;

  public PieceWorker(String firstname, String lastname, String socialsecuritynumber, Date birthdate,
                            double wage, int pieces){
    super(firstname, lastname, socialsecuritynumber, birthdate);
    if (wage < 0.0) { // validate wage
       throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    }
    if (pieces < 0){
      throw new IllegalArgumentException("Cannot have negative pieces made.");
    }
    this.wage = wage;
    this.pieces = pieces;
  }

  public int getPieces(){return pieces;}
  public double getWage(){return wage;}

  public void setPieces(int pieces){
    if (pieces < 0){
      throw new IllegalArgumentException("Cannot have negative pieces made.");
    }
    this.pieces = pieces;
  }
  public void setWage(double wage){
    if (wage < 0.0) { // validate wage
       throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    }
    this.wage = wage;
  }

  @Override
  public String toString(){
    return String.format("%s: %s%n%s $%.2f%n %s %d%n %s $%.2f", "PieceWorker", super.toString(), "\nWage:", getWage(),"Total Pieces:", getPieces(), "Total Earnings: ", earnings());
  }

  @Override
  public double earnings(){
    return getWage() * getPieces();
  }
}

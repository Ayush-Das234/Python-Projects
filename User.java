public class User{
  private String name;
  private double accountBalance;

  public User(String a){
    this.name = a;
    this.accountBalance = 0;
  }

  public String getName(){
    return this.name;
  }

  public double getAccountBalance(){
    return this.accountBalance;
  }

  public double updateBalance(double a){
    accountBalance = accountBalance + a;
    return accountBalance;
  }

  public double subtractBalance(double a){
    accountBalance = accountBalance - a;
    return accountBalance;
  }

  public String toString(){
    return getName() + " balance is " + getAccountBalance();
  }












}

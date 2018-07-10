public class Item{
  private String name;
  private double listCost;
  private User owner;
  private boolean forSale;

  public Item(String a, double b, User c, boolean d){
    this.name = a;
    this.listCost = b;
    this.owner = c;
    this.forSale = d;
  }

  public String getName(){
    return this.name;
  }

  public double getListCost(){
    return this.listCost;
  }

  public User getOwner(){
    return this.Owner;
  }

  public boolean getForSale(){
    return this.forSale;
  }

  public void setOwner(User a){
    this.Owner = a;
  }

  public void setListCost(double a){
    this.listCost = a;
  }

  public void toggleForSale(){
    if(this.forSale == false){
      this.forSale = true;
    }else if(this.forSale == true){
      this.forSale = false;
    }
  }

  public void purchaseItem(User a, double b){
    a.updateBalance(b);
    setOwner(a);
    toggleForSale();
  }

  public String toString(){}
    return "this.getName() + "( " + this.getListCost() + " - " + getOwner() + " )"";
}

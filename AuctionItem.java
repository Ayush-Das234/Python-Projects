public class AuctionItem extends Item{
  private int daysLeft;
  private double currentBid;
  private User highbidder;

  public AuctionItem(String a, double b, Owner c, int d){
    super(a, b, c, true);
    this.currentBid = listCost;
    this.highbidder = null;
  }

  public int getDaysLeft(){
    return this.daysLeft;
  }

  public double getCurrentBid(){
    return this.currentBid;
  }

  public void advanceDay(){
    if(this.getForSale() == true){
      if(this.getDaysLeft() == 0){
        this.getOwner().updateBalance(currentBid);
        this.highbidder.subtractBalance(currentBid);
        this.owner = highbidder;
        resetAuction();
      }else{
        this.daysLeft--;
      }
    }
}
    public String makeBid(User a, double b){
      if(this.getForSale() == true){
        if(b > this.getCurrentBid()){
          this.currentBid = b;
          this.highbidder = a;
        }
      }
      return this.highbidder;
    }

    public void resetAuction(double a, int b){
      if(this.highbidder == null){
        this.listCost = a;
        this.daysLeft = b;
      }
    }

    public String toString(){
      if(this.getForSale == true){
        return " " + this.name + "(" + this.getCurrentBid() + ", " + this.highbidder + ", " + this.getDaysLeft() + ")";
      }else{
        return "( " + this.getName() + "( " + this.getListCost() + " - " + getOwner() + " )"";
      }
    }
}

import java.util.ArrayList;

public class CandyShop {

  String candy;
  String lollipop;
  int sugarAmount;
  int percentage;
  int price;
  int

  public CandyShop(int sugarAmount) {
    this.sugarAmount = sugarAmount;

  }



  public void createSweets(String type) {
    ArrayList<String> stock = new ArrayList<>();
    this.candy = type;
    this.lollipop = type;
    sugarAmount--;
  }

  public int raisePrice(int percentage) {
    this.percentage = percentage;
    int newPrice;
    newPrice = (price * percentage) / 100;
    return  newPrice;
  }

  public void sell(int sweetsForSale){
    for (int i = 0; i < sweetsForSale ; i++) {

      
    }

  }


}

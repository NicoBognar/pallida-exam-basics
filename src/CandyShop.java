import java.lang.reflect.Array;
import java.util.ArrayList;

public class CandyShop {

  static String CANDY;
  static String LOLLIPOP;
  int sugarAmount;
  int percentage;
  int price;
  int money;
  ArrayList<String> stock;

  public CandyShop(int money) {
    this.money = money;

  }


  public void createSweets(String type) {
    this.stock = new ArrayList<>();
    this.CANDY = type;
    this.LOLLIPOP = type;
    sugarAmount--;
    stock.add(type);
  }

  public int raisePrice(int percentage) {
    this.percentage = percentage;
    int newPrice;
    newPrice = (price * percentage) / 100;
    return newPrice;
  }

  public void sell(int sweetsForSale) {
    for (int i = 0; i < sweetsForSale; i++) {
      stock.remove(i);
      money += i * price;
    }

  }

  public void buySugar(int sugarAmount) {
    this.sugarAmount = sugarAmount;
    if (money > 100) {
      for (int i = 0; i < money; i -= 100) {
        sugarAmount += 1000;

      }
    }
  }

}

import java.util.ArrayList;
import java.util.Arrays;

public class CandyShop {

  static String CANDY;
  static String LOLLIPOP;
  int sugarAmount;
  int percentage;
  int price;
  int money;
  int income;
  ArrayList<String> stock;

  public CandyShop(int money) {
    this.money = money;
    this.income = income;

    System.out.println(
        "Inventory: " + stock + ", Income: $" + income + ", Sugar: " + sugarAmount + " gr");
  }

  public void createSweets(String type) {
    this.stock = new ArrayList<>();
    this.CANDY = type;
    this.LOLLIPOP = type;
    sugarAmount--;
    stock.add(type);
  }

  public int raise(int percentage) {
    this.percentage = percentage;
    int newPrice;
    newPrice = (price * percentage) / 100;
    return newPrice;
  }

  public void sell(String type, int sweetsForSale) {
    for (int i = 0; i < sweetsForSale; i++) {
      stock.remove(i);
      money += i * price;
      this.income = i * price;
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

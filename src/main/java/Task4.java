import java.util.ArrayList;
import java.util.List;

public class Task4 {
  public static void main(String[] args) {
    List<Double> prices = new ArrayList<>();
    prices.add(199.99);
    prices.add(450.50);
    prices.add(120.00);
    prices.add(89.90);
    prices.add(310.10);

    double budget = 800.00;
    double spent = 0;
    int bought = 0;

    for (double price : prices) {
      if (spent + price > budget) {
        break;
      }
      spent += price;
      bought++;
    }

    System.out.printf("Куплено товаров: %d на сумму %.2f%n", bought, spent);
    System.out.printf("Остаток бюджета: %.2f%n", budget - spent);
    System.out.println("Не куплено: " + (prices.size() - bought));
  }
}
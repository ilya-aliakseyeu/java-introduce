import java.util.ArrayList;
import java.util.List;

public class Task4 {
  public static void main(String[] args) {
    double count = 0;

    List<Double> prices = new ArrayList<>();
    prices.add(199.99);
    prices.add(450.50);
    prices.add(120.00);
    prices.add(89.90);
    prices.add(310.10);

    double budget = 800.00;
    int products = 0;
    double remainingBudget;
    int notBuying;

    for (int i = 0; i < prices.size(); i++) {
      products++;
      count += prices.get(i);
      remainingBudget = budget - count;
      notBuying = 5 - products;
      if (count >= budget) {
        break;
      }
      System.out.println("Куплено товаров " + products + " на сумму " + count);
      System.out.println("Остаток бюджета: " + remainingBudget);
      System.out.println("Не куплено: " + notBuying);
      System.out.println();
    }
  }
}

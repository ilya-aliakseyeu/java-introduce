import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>();
        prices.add(199.99);
        prices.add(450.50);
        prices.add(120.00);
        prices.add(89.90);
        prices.add(310.10);

        double budget = 1200.00;
        double totalPrice = 0.0;

        for (double price : prices) {
            totalPrice += price;
        }
        System.out.println();
        System.out.println("Общая сумма товаров: " + totalPrice);
        System.out.println("Ваш бюджет: " + budget);

        if (budget >= totalPrice) {
            double remainder = budget - totalPrice;
            System.out.printf("Бюджета хватает. Остаток: %.2f%n", remainder);
        } else {
            double deficit = totalPrice - budget;
            System.out.printf("Бюджета не хватает! Не хватает: %.2f%n", deficit);
        }
    }
}

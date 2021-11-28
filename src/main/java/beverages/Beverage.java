package beverages;

import supplements.Supplement;

import java.util.List;

public class Beverage {
    private final double price;
    private final List<Supplement> supplements;

    public Beverage(double price, List<Supplement> supplements) {
        this.price = price;
        this.supplements = supplements;
    }

    public double price(){
        return this.price + supplements.stream().map(Supplement::additionalPrice).reduce(0d, Double::sum);
    }
}

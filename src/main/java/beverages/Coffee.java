package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Beverage {

    private static final double PRICE = 1.2;

    public Coffee() {
        super(PRICE, new ArrayList<>());
    }

    public Coffee(List<Supplement> supplements) {
        super(PRICE, supplements);
    }
}

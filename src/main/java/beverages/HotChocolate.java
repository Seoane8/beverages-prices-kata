package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class HotChocolate extends Beverage {

    private static final double PRICE = 1.45;

    public HotChocolate() {
        super(PRICE, new ArrayList<>());
    }

    public HotChocolate(List<Supplement> supplements) {
        super(PRICE, supplements);
    }
}

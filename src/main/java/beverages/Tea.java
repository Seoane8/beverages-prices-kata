package beverages;

import supplements.Supplement;

import java.util.ArrayList;
import java.util.List;

public class Tea extends Beverage {

    private static final double PRICE = 1.5;

    public Tea() {
        super(PRICE, new ArrayList<>());
    }

    public Tea(List<Supplement> supplements) {
        super(PRICE, supplements);
    }
}

package beverages;

import supplements.Cream;

import java.util.List;

public class HotChocolateWithCream extends HotChocolate {

    public HotChocolateWithCream() {
        super(List.of(new Cream()));
    }

    @Override
    public double price() {
        return 1.45 + 0.15;
    }
}

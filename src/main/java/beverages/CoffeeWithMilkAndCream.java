package beverages;

import supplements.Cream;
import supplements.Milk;

import java.util.List;

public class CoffeeWithMilkAndCream extends Coffee {

    public CoffeeWithMilkAndCream() {
        super(List.of(new Milk(), new Cream()));
    }
}

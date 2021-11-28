package beverages;

import supplements.Milk;

import java.util.List;

public class CoffeeWithMilk extends Coffee {

    public CoffeeWithMilk() {
        super(List.of(new Milk()));
    }
}

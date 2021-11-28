package beverages;

import supplements.Milk;

import java.util.List;

public class TeaWithMilk extends Tea {

    public TeaWithMilk() {
        super(List.of(new Milk()));
    }
}

package unit_tests;

import beverages.*;
import org.junit.Test;
import supplements.Cinnamon;
import supplements.Cream;
import supplements.Milk;
import supplements.Supplement;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class BeveragesPricingTest {
    @Test
    public void computes_coffee_price() {
        Beverage coffee = new Coffee();
        assertThat(coffee.price(), is(closeTo(1.20, 0.001)));
    }

    @Test
    public void computes_tea_price() {
        Beverage tea = new Tea();
        assertThat(tea.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_price() {
        Beverage hotChocolate = new HotChocolate();
        assertThat(hotChocolate.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_price() {
        List<Supplement> supplements = List.of(new Milk());
        Beverage teaWithMilk = new Tea(supplements);
        assertThat(teaWithMilk.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_price() {
        List<Supplement> supplements = List.of(new Milk());
        Beverage coffeeWithMilk = new Coffee(supplements);
        assertThat(coffeeWithMilk.price(), is(closeTo(1.30, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_price() {
        List<Supplement> supplements = List.of(new Milk(), new Cream());
        Beverage coffeeWithMilkAndCream = new Coffee(supplements);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.45, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_price() {
        List<Supplement> supplements = List.of(new Cream());
        Beverage hotChocolateWithCream = new HotChocolate(supplements);
        assertThat(hotChocolateWithCream.price(), is(closeTo(1.60, 0.001)));
    }

    @Test
    public void computes_coffee_with_cinnamon_price() {
        List<Supplement> supplements = List.of(new Cinnamon());
        Beverage coffeeWithCinnamon = new Coffee(supplements);
        assertThat(coffeeWithCinnamon.price(), is(closeTo(1.25, 0.001)));
    }

    @Test
    public void computes_tea_with_cinnamon_price() {
        List<Supplement> supplements = List.of(new Cinnamon());
        Beverage teaWithCinnamon = new Tea(supplements);
        assertThat(teaWithCinnamon.price(), is(closeTo(1.55, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cinnamon_price() {
        List<Supplement> supplements = List.of(new Cinnamon());
        Beverage hotChocolateWithCinnamon = new HotChocolate(supplements);
        assertThat(hotChocolateWithCinnamon.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_tea_with_milk_and_cinnamon_price() {
        List<Supplement> supplements = List.of(new Milk(), new Cinnamon());
        Beverage teaWithMilk = new Tea(supplements);
        assertThat(teaWithMilk.price(), is(closeTo(1.65, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cinnamon_price() {
        List<Supplement> supplements = List.of(new Milk(), new Cinnamon());
        Beverage coffeeWithMilk = new Coffee(supplements);
        assertThat(coffeeWithMilk.price(), is(closeTo(1.35, 0.001)));
    }

    @Test
    public void computes_coffee_with_milk_and_cream_and_cinnamon_price() {
        List<Supplement> supplements = List.of(new Milk(), new Cream(), new Cinnamon());
        Beverage coffeeWithMilkAndCream = new Coffee(supplements);
        assertThat(coffeeWithMilkAndCream.price(), is(closeTo(1.50, 0.001)));
    }

    @Test
    public void computes_hot_chocolate_with_cream_and_cinnamon_price() {
        List<Supplement> supplements = List.of(new Cream(), new Cinnamon());
        Beverage hotChocolateWithCream = new HotChocolate(supplements);
        assertThat(hotChocolateWithCream.price(), is(closeTo(1.65, 0.001)));
    }
}

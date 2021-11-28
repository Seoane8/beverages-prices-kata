package supplements;

public class Supplement {

    private final double additionalPrice;

    public Supplement(double additionalPrice) {
        this.additionalPrice = additionalPrice;
    }

    public double additionalPrice() {
        return this.additionalPrice;
    }
}

package qaautomation.collections.main.candy;

import qaautomation.collections.main.candy.Candy;

public class Chocolate extends Candy {
    public Chocolate(Double weight, int sugarContent) {
        super(weight, sugarContent);
        nameOfSweet = "Chocolate";
    }

    @Override
    public String toString() {
        return nameOfSweet + " (Weight - " + getWeight() + ", Sugar content - " + getSugarContent() + ")";
    }
}

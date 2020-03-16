package qaautomation.collections.main.candy;

public class Lollipop extends Candy {
    public Lollipop(Double weight, int sugarContent) {
        super(weight, sugarContent);
        nameOfSweet = "Lollipop";
    }

    @Override
    public String toString() {
        return nameOfSweet + " (Weight - " + getWeight() + ", Sugar content - " + getSugarContent() + ")";
    }
}


public class Drink {

    private double price;

    Drink(double price) {
        this.price = price;
    }

    public double setPrice(double price) {
        if (price < 0 ) {
            throw new IllegalArgumentException ("Score må ikke være negativ");
        }
        this.price = price;
        return price;
    }

    public double getPrice() {
        return this.price;
    }
}

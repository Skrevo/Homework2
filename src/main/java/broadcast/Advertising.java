package broadcast;

public class Advertising extends PartOfBroadcast{

    private String nameOfProduct;

    private double price = 5.0 * 60;

    public Advertising(String name, double duration, String nameOfProduct) {
        super(name, duration);
        this.nameOfProduct = nameOfProduct;
    }

    @Override
    public double getCost() {
        super.price = this.price;
        return super.getCost();
    }

    @Override
    public String toString() {
        return "Advertising{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", duration='" + getDuration() + '\'' +
                ", costing=" + getCost() +
                '}';
    }
}

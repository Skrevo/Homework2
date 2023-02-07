package broadcast;

public class Interview extends PartOfBroadcast{

    private String nameOfAuthor;

    private double price = 30.0;

    public Interview(String name, double duration, String nameOfAuthor) {
        super(name, duration);
        this.nameOfAuthor = nameOfAuthor;
    }

    @Override
    public double getCost() {
        super.price = this.price;
        return super.getCost();
    }

    @Override
    public String toString() {
        return "Interview{" +
                "nameOfAuthor='" + nameOfAuthor + '\'' +
                ", duration='" + getDuration() + '\'' +
                ", costing=" + getCost() +
                '}';
    }
}

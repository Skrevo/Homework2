package broadcast;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public abstract class PartOfBroadcast {
    private String name;
    private double duration;

    protected double price;


    public PartOfBroadcast(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public double getCost() {
        return this.duration * this.price;
    }
}

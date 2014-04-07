/**
 * Created by mrk on 4/7/14.
 */
public class Eagle implements FlyingCreature, FeatheredCreature {
    String currentLocation;
    int numberOfFeathers;

    public Eagle(int initialNumberOfFeathers) {
        this.numberOfFeathers = initialNumberOfFeathers;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }
}

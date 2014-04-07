/**
 * Created by mrk on 4/7/14.
 */
public class Greeter {
    private Personality personality;

    public Greeter(Personality personality) {
        this.personality = personality;
        }

    public String greet() {
        return this.personality.greet();
    }
}

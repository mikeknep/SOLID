/**
 * Created by mrk on 4/8/14.
 */
public class UnitUpgrader {
    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;
    }
}

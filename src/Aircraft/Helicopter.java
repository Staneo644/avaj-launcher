package Aircraft;
import utils.Coordinates;
import utils.OrthogonalCoordinates;
import utils.Weather;

public class Helicopter extends Aircraft {
    public Helicopter(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);

        this.reactions.put(Weather.SUN, new OrthogonalCoordinates(10, 0, 2));
        this.reactions.put(Weather.RAIN, new OrthogonalCoordinates(5, 0, 0));
        this.reactions.put(Weather.FOG, new OrthogonalCoordinates(1, 0, 0));
        this.reactions.put(Weather.SNOW, new OrthogonalCoordinates(0, 0, -12));

    }

    public void updateConditions() {
        updateConditionsParent();
    }

}
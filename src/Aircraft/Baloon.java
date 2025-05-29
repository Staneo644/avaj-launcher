package Aircraft;

import utils.Coordinates;
import utils.OrthogonalCoordinates;
import utils.Weather;

public class Baloon extends Aircraft {
    public Baloon(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);

        this.reactions.put(Weather.SUN, new OrthogonalCoordinates(2, 0, 4));
        this.reactions.put(Weather.RAIN, new OrthogonalCoordinates(0, 0, -5));
        this.reactions.put(Weather.FOG, new OrthogonalCoordinates(0, 0, -3));
        this.reactions.put(Weather.SNOW, new OrthogonalCoordinates(0, 0, -15));
    }

    public void updateConditions() {
        updateConditionsParent();
    }    
}

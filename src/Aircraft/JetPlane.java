package Aircraft;
import utils.Coordinates;
import utils.OrthogonalCoordinates;
import utils.Weather;

public class JetPlane extends Aircraft {
    public JetPlane(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);

        this.reactions.put(Weather.SUN, new OrthogonalCoordinates(0, 10, 2));
        this.reactions.put(Weather.RAIN, new OrthogonalCoordinates(0, 5, 0));
        this.reactions.put(Weather.FOG, new OrthogonalCoordinates(0, 1, 0));
        this.reactions.put(Weather.SNOW, new OrthogonalCoordinates(0, 0, -7));
    }    

    public void updateConditions() {
        updateConditionsParent();
    }
}

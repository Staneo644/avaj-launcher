package Aircraft;
import java.util.HashMap;
import java.util.Map;

import Tower.WeatherTower;
import utils.Coordinates;
import utils.OrthogonalCoordinates;
import utils.Print;
import utils.Weather;

public class Aircraft implements Flyable {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    protected WeatherTower weatherTower;
    protected Map<Weather, OrthogonalCoordinates> reactions = new HashMap<>();

    protected Aircraft(long id, String name, Coordinates coordinates) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return this.name;
    }

    protected void updateConditionsParent() {
        Weather weather = weatherTower.getWeather(coordinates);
        OrthogonalCoordinates reaction = reactions.get(weather);

        if (reaction != null) {
            if (!coordinates.setCoordinate(reaction)) {
                weatherTower.unregister(this);
                return;
            }
            Print.getInstance().print(this + ": " + weather + " - " + coordinates);
        } else {
            Print.getInstance().print(this + ": No reaction for weather " + weather);
        }
    }

    public void updateConditions() {
        updateConditionsParent();
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
        weatherTower.register(this);
    }
}

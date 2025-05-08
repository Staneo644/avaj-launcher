package Aircraft;
import Tower.WeatherTower;

public abstract class Flyable {

    abstract void updateConditions();
    abstract void registerTower(WeatherTower weatherTower);
}
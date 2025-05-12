package Aircraft;
import Tower.WeatherTower;

public abstract class Flyable {
    WeatherTower weatherTower;

    abstract void updateConditions();
    abstract void registerTower(WeatherTower weatherTower);
}
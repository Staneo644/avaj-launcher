package Aircraft;
import Tower.WeatherTower;

public abstract class Flyable {
    WeatherTower weatherTower;

    public abstract void updateConditions();
    abstract void registerTower(WeatherTower weatherTower);
}
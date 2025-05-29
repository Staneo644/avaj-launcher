package Aircraft;
import Tower.WeatherTower;

public interface Flyable {
    static final WeatherTower weatherTower = new WeatherTower();

    public abstract void updateConditions();
    public abstract void registerTower(WeatherTower weatherTower);
}
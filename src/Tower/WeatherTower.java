package Tower;
import Aircraft.Flyable;
import utils.Coordinates;
import utils.Weather;
import utils.WeatherProvider;

public class WeatherTower extends Tower {
    public void changeWeather() {
        for (int i = 0; i < observers.size(); i++) {
            Flyable flyable = observers.get(i);
            flyable.updateConditions();
        }
    }

    public Weather getWeather(Coordinates coordinates) {
        Weather weather = WeatherProvider.getInstance().getCurrentWeather(coordinates);
        return weather;
    }
    
}

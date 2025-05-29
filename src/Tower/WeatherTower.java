package Tower;
import Aircraft.Flyable;
import utils.Coordinates;
import utils.Weather;
import utils.WeatherProvider;

public class WeatherTower extends Tower {
    public void changeWeather() {
        conditionsChanged();
    }

    public Weather getWeather(Coordinates coordinates) {
        Weather weather = WeatherProvider.getInstance().getCurrentWeather(coordinates);
        return weather;
    }
    
}

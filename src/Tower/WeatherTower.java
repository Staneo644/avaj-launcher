package Tower;
import utils.Coordinates;
import utils.Weather;

public class WeatherTower extends Tower {
    public void changeWeather() {
        // Logic to change the weather
    }

    public Weather getWeather(Coordinates coordinates) {
        return Weather.SUN;
    }
    
}

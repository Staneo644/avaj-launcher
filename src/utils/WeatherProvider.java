package utils;

public class WeatherProvider {
    private static final WeatherProvider INSTANCE = new WeatherProvider();

    private WeatherProvider() {}

    public static WeatherProvider getInstance() {
        return INSTANCE;
    }

    public Weather getCurrentWeather(Coordinates coordinates) {
        Weather[] weatherOptions = Weather.values();
        return weatherOptions[(int) (Math.random() * weatherOptions.length)];
    }
}

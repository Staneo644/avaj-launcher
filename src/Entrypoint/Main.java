package Entrypoint;
import java.util.List;
import Aircraft.AircraftFactory;
import Tower.WeatherTower;
import utils.Coordinates;

public class Main {
    public static void main(String[] args) {
        WeatherTower weatherTower = new WeatherTower();
        AircraftFactory aircraftFactory = new AircraftFactory(weatherTower);
        List<String> lines = Parsing.parse(args);

        if (lines == null || lines.size() <= 1) {
            System.out.println("Invalid input. Please provide a valid file with aircraft data.");
            return;
        }

        int simulationDuration = Integer.parseInt(lines.get(0));
        if (simulationDuration <= 0) {
            System.out.println("Invalid simulation duration. Must be a positive integer.");
            return;
        }

        for (int i = 1; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.isEmpty()) {
                continue;
            }

            String[] parts = line.split(" ");
            if (parts.length < 5) {
                System.out.println("Invalid input format: " + line);
                continue;
            }

            String type = parts[0];
            String name = parts[1];
            int longitude = Integer.parseInt(parts[2]);
            int latitude = Integer.parseInt(parts[3]);
            int height = Integer.parseInt(parts[4]);

            System.out.println("Creating aircraft: " + type + " " + name + " " + longitude + " " + latitude + " " + height);

            aircraftFactory.newAircraft(type, name, new Coordinates(longitude, latitude, height));

        }
        for (int i = 0; i < simulationDuration; i++) {
            weatherTower.changeWeather();
        }
    }
}
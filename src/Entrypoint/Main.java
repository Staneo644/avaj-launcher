package Entrypoint;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = Parsing.parse(args);

        int simulationDuration = lines.size() > 0 ? Integer.parseInt(lines.get(0)) : 0;
        if (simulationDuration <= 0) {
            System.out.println("Invalid simulation duration. Must be a positive integer.");
            return;
        }

        
    }
}
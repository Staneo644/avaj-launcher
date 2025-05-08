package Entrypoint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Parsing {
    public static List<String> parse(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Parsing <filename>");
            return null;
        }

        // String filename = args[0];

         String filePath = args[0];

        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                System.out.println(line);
            }
            return lines;
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return null;
    }
}

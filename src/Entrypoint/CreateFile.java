package Entrypoint;

import utils.Print;

public class CreateFile {
    public static java.nio.file.Path createFile(String filename) {
        java.nio.file.Path path = java.nio.file.Paths.get(filename);
        try {
            java.nio.file.Files.write(path, new byte[0], java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.TRUNCATE_EXISTING);

            Print.getInstance().setPath(path);
            return path;
        } catch (java.io.IOException e) {
            System.err.println("Error creating or truncating file: " + e.getMessage());
            return null;
        }
    }
}

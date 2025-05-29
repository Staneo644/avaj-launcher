package utils;

public class Print {
    private static final Print INSTANCE = new Print();
    private java.nio.file.Path path; 


    private Print() {}

    public static Print getInstance() {
        return INSTANCE;
    }

    public void setPath(java.nio.file.Path path) {
        this.path = path;
    }

    public void print(String message) {
        if (path != null) {
            try {
                java.nio.file.Files.writeString(path, message + System.lineSeparator(), java.nio.file.StandardOpenOption.APPEND);
            } catch (java.io.IOException e) {
                System.err.println("Error writing to file: " + e.getMessage());
            }
        } else {
            System.out.println(message);
        }
    }

}
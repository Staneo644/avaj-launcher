package utils;

public enum Weather {
    SUN("SUN"),
    RAIN("RAIN"),
    FOG("FOG"),
    SNOW("SNOW");
    
    private final String description;
    
    Weather(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
}
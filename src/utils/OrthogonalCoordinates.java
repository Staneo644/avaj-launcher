package utils;

public class OrthogonalCoordinates {
    public int longitude;
    public int latitude;
    public int height;

    public OrthogonalCoordinates(int longitude, int latitude, int height) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
    }   

    @Override
    public String toString() {
        return "{" + longitude + ", " + latitude + ", " + height + "}";
    }

}

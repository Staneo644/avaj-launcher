package utils;
public class Coordinates {
    OrthogonalCoordinates orthogonalCoordinates;

    public Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.orthogonalCoordinates = new OrthogonalCoordinates(p_longitude, p_latitude, Math.max(1, p_height));
    }

    public int getLongitude() {
        return orthogonalCoordinates.longitude;
    }

    public int getLatitude() {
        return orthogonalCoordinates.latitude;
    }

    public int getHeight() {
        return orthogonalCoordinates.height;
    }

    public Boolean setCoordinate(int longitude, int latitude, int height) {
        orthogonalCoordinates.longitude = Math.max(0, longitude);
        orthogonalCoordinates.latitude = Math.max(0, latitude);
        orthogonalCoordinates.height = Math.min(height, 100);
        if (orthogonalCoordinates.height <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "{" + orthogonalCoordinates.height + "-" + orthogonalCoordinates.latitude + "-" + orthogonalCoordinates.longitude + "}";
    }
}

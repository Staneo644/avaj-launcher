package utils;
public class Coordinates {
    OrthogonalCoordinates orthogonalCoordinates;

    public Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.orthogonalCoordinates = new OrthogonalCoordinates(p_longitude, p_latitude, Math.max(1, p_height));
        System.out.println("Coordinates constructor called with: " + orthogonalCoordinates);
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
        orthogonalCoordinates.longitude += longitude;
        orthogonalCoordinates.latitude += latitude;
        orthogonalCoordinates.height += height;
        if (orthogonalCoordinates.longitude < 0) {
            orthogonalCoordinates.longitude = 0;
        }
        if (orthogonalCoordinates.latitude < 0) {
            orthogonalCoordinates.latitude = 0;
        }
        orthogonalCoordinates.height = Math.min(orthogonalCoordinates.height, 100);
        if (orthogonalCoordinates.height <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return orthogonalCoordinates.toString();
    }
}

package utils;
public class Coordinates {
    int longitude;
    int latitude;
    int height;

    public Coordinates(int p_longitude, int p_latitude, int p_height) {
        this.longitude = p_longitude;
        this.latitude = p_latitude;
        this.height = Math.max(1, p_height);
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getHeight() {
        return height;
    }

    public Boolean setCoordinate(OrthogonalCoordinates orthogonalCoordinates) {
        this.longitude += orthogonalCoordinates.longitude;
        this.latitude += orthogonalCoordinates.latitude;
        this.height += orthogonalCoordinates.height;
        if (this.longitude < 0) {
            this.longitude = 0;
        }
        if (this.latitude < 0) {
            this.latitude = 0;
        }
        this.height = Math.min(this.height, 100);
        if (this.height <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        OrthogonalCoordinates printable = new OrthogonalCoordinates(this.longitude, this.latitude, this.height);
        return printable.toString();
    }
}

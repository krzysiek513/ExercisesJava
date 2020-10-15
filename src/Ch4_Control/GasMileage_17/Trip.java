package Ch4_Control.GasMileage_17;

public class Trip {
    int miles_driven;
    int gallons_used;
    double distance;

    public Trip(int miles_driven, int gallons_used) {
        this.miles_driven = miles_driven;
        this.gallons_used = gallons_used;
        this.distance = distance(miles_driven, gallons_used);
    }

    public int distance(int mile, int gallons) {
        return mile / gallons;
    }

    public double getDistance() {
        return distance;
    }

    public int getMiles_driven() {
        return miles_driven;
    }

    public void setMiles_driven(int miles_driven) {
        this.miles_driven = miles_driven;
    }

    public int getGallons_used() {
        return gallons_used;
    }

    public void setGallons_used(int gallons_used) {
        this.gallons_used = gallons_used;
    }
}

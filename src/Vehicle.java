import java.util.Objects;

public abstract class Vehicle {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return kilometers == vehicle.kilometers && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, kilometers);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    private String brand;
    private int kilometers;

    public Vehicle( String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public abstract void doStuff();


}

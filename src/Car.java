public class Car extends Vehicle {
    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public void doStuff() {
        System.out.println("Je suis " + this.getBrand() + " et je fais vroum vroum ");
    }
}

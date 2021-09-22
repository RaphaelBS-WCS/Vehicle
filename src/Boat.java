public class Boat extends Vehicle{
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public void doStuff() {
        System.out.println("Je suis " + this.getBrand() + " et je fais glou glou !");
    }
}

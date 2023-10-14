package lab_defining_classes.p2_car_constructors;

class Car {
    private String brand;
    private String model;
    private int horsePower;


    public Car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsePower = -1;
    }

    public Car(String brand, String model, int horsePower) {
        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "The car is: " + brand + " " + model + " - " + (horsePower == -1 ? -1 + " HP" : horsePower + " HP") + ".";
    }
}

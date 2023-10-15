package defining_classes.p7_google;

class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String toString() {
        return model + " " + speed;
    }
}


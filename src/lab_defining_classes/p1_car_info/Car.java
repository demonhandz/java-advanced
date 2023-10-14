package lab_defining_classes.p1_car_info;

class Car {
    private String model;
    private String brand;
    private int horsePower;

    public Car() {
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return String.format(String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower()));
    }
}

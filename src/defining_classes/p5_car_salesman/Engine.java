package defining_classes.p5_car_salesman;

class Engine {
    private String model;
    private String power;
    private String displacement;
    private String efficiency;

    public Engine(String model, String power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        return String.format("Power: %s\nDisplacement: %s\nEfficiency: %s", power, displacement, efficiency);
    }
}

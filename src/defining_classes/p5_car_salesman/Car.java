package defining_classes.p5_car_salesman;

class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        String weightStr = (weight != null && !weight.equals("0")) ? weight : "n/a";
        String colorStr = (color != null) ? color : "n/a";
        return String.format("%s:\n%s\nWeight: %s\nColor: %s", model, engine != null ? engine : "n/a", weightStr, colorStr);
    }
}

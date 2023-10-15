package defining_classes.p5_car_salesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int engineCount = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < engineCount; i++) {
            String[] engineInfo = scanner.nextLine().split(" ");
            String model = engineInfo[0];
            String power = engineInfo[1];
            String displacement = (engineInfo.length > 2) ? engineInfo[2] : "n/a";
            String efficiency = (engineInfo.length > 3) ? engineInfo[3] : "n/a";
            Engine engine = new Engine(model, power, displacement, efficiency);
            engines.put(model, engine);
        }

        int carCount = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < carCount; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            String model = carInfo[0];
            String engineModel = carInfo[1];
            Engine engine = engines.get(engineModel);
            String weight = (carInfo.length > 2) ? carInfo[2] : "n/a";
            String color = (carInfo.length > 3) ? carInfo[3] : null;
            Car car = new Car(model, engine, weight, color);
            cars.add(car);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

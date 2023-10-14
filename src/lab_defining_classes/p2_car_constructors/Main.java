package lab_defining_classes.p2_car_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] carInfo = scanner.nextLine().split(" ");
            if(carInfo.length == 1) {
                //Create a car with only the brand information
                cars.add(new Car(carInfo[0]));
            } else if (carInfo.length == 3) {
                //Create a car with complete information
                cars.add(new Car(carInfo[0], carInfo[1], Integer.parseInt(carInfo[2])));
            }
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}

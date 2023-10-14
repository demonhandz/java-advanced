package defining_classes.p4_raw_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        ArrayList<Car> carList = new ArrayList<>();
        while (n > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            ArrayList<Tire> tireList = new ArrayList<>();
            for (int i = 5; i < 12; i+=2) {
                int a = i+1;
                Tire tire = new Tire(Double.parseDouble(tokens[i]),Integer.parseInt(tokens[a]));
                tireList.add(tire);
            }
            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, cargoType);
            Car car = new Car(model, engine, cargo, tireList);
            carList.add(car);
        }
        String type = reader.readLine();
        if(type.equals("fragile")) {
            List<String> model = new ArrayList<>();
            for (int i = 0; i < carList.size(); i++) {
                if(carList.get(i).getCargo().getCargoType().equals("fragile")) {
                    if(carList.get(i).getTires().get(i).getTirePressure() < 1) {
                        model.add(carList.get(i).getModel());
                    }
                }
            }
            model.forEach(System.out::println);
        } else {
            carList.forEach( e->{
                if(e.getCargo().getCargoType().equals("flamable")
                && e.getEngine().getEnginePower() > 250){
                    System.out.println(String.format("%s", e.getModel()));
                }
            });
        }
    }
}

package web.dao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private static List<Car> cars =new ArrayList<>();
    static  {
        cars.add(new Car(1,"MANTA", "Opel", 1991));
        cars.add(new Car(2, "CAPRICE ", "Chevrolet", 1987));
        cars.add(new Car(3, "1000 MB ", "Skoda", 1964));
        cars.add(new Car(4, "Niva ", "Vaz", 1976));
        cars.add(new Car(5, "246 GT ", "FERRARI", 1969));
    }
    @Override
    public List<Car> getCars(int count) {
        List<Car> cars_edited=cars;
        if (count >=5) {
           return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());

    }

   }
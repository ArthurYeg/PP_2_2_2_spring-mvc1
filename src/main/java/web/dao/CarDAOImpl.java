package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> cars =new ArrayList<>();

    public CarDAOImpl() {

        cars.add(new Car("Opel", "MANTA", 1991));
        cars.add(new Car("Chevrolet", "CAPRICE", 1987));
        cars.add(new Car("Skoda", "1000 MB", 1964));
        cars.add(new Car("Vaz", "Niva", 1976));
        cars.add(new Car("FERRARI DINO", "246 GT", 1969));
    }

    public List<Car> getCarList(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }
}
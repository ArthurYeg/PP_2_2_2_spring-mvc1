package web.dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private List<Car> carList;

    public CarDAOImpl() {
        carList=new ArrayList<>();
        carList.add(new Car("Opel", "MANTA", 1991));
        carList.add(new Car("Chevrolet", "CAPRICE", 1987));
        carList.add(new Car("Skoda", "1000 MB", 1964));
        carList.add(new Car("Vaz", "Niva", 1976));
        carList.add(new Car("FERRARI DINO", "246 GT", 1969));
    }
    @Override
    public List<Car>getAllCars(){
        return carList;
    }
}

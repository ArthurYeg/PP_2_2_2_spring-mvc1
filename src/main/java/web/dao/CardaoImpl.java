package web.dao;
import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CardaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    public CardaoImpl() {
        cars.add(new Car("Opel", "MANTA", 1991));
        cars.add(new Car("Chevrolet", "CAPRICE", 1987));
        cars.add(new Car("Skoda", "1000 MB", 1964));
        cars.add(new Car("Vaz", "Niva", 1976));
        cars.add(new Car("FERRARI DINO", "246 GT", 1969));
    }
    @Override
    public List<Car> getCars(int  count){
        List<Car> cars_edited = cars;
        if (count <= 5) {
            cars_edited = cars.stream().limit(count).collect(Collectors
                    .toCollection(ArrayList::new));
        }
        return cars_edited;
    }
}

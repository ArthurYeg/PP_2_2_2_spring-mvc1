package web.serivice;
import web.dao.CarDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.Car;


import java.util.List;

@Component
public class CarserviceImpl implements CarService {
    private CarDao cardao;
    @Autowired
    public CarserviceImpl(CarDao cardao) {
        this.cardao = cardao;
    }

    @Override
    public List<Car> carsCount(List<Car> list, int number) {
        return List.of();
    }

    @Override
    public List<Car> getCars(int  count){
        return cardao.getCars(count);
    }

}

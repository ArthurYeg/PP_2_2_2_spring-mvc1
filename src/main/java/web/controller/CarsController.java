package web.controller;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;
import web.serivice.CarService;

import java.util.List;
import java.util.logging.Logger;


@Controller
public class CarsController {
    private final CarService carService;


   @Autowired
    public CarsController(CarService carService){
       this.carService=carService;
    }

    @GetMapping( "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

//       List<Car> cars = carService.getCarList(count);
//        model.addAttribute("cars", cars);
        return "cars";
    }
}

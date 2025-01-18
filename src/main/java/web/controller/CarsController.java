package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.serivice.CarService;

import java.util.List;


@Controller
public class CarsController {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String Getcars(ModelMap model, @RequestParam(value = "count",defaultValue = "5") int count) {
        model.addAttribute("cars", carService.getCarList(count));
        return "car";
    }
}

package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CarService;

import java.util.List;

@Controller
public class CarsController {
    private final CarService carService = new CarService();
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(name = "count", defaultValue = "5")
                               int count, Model model) {
        List<Car> cars = carService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

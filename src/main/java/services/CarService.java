package services;

import models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("TestName1", "TestModel1", 1));
        cars.add(new Car("TestName2", "TestModel2", 2));
        cars.add(new Car("TestName3", "TestModel3", 3));
        cars.add(new Car("TestName4", "TestModel4", 4));
        cars.add(new Car("TestName5", "TestModel5", 5));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }


}



package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp {
    private List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "KIA", 5));
        carList.add(new Car(2, "Hyundai", 20));
        carList.add(new Car(3, "Honda", 12));
        carList.add(new Car(4, "Toyota", 40));
        carList.add(new Car(5, "BMW", 5));
    }

    public List<Car> getCarByCount( int count) {
        List<Car> list = new ArrayList<>();
        if(count <= 0 || count >= 5) return carList;

        for (int i = 0; i < count; i++) {
            list.add(carList.get(i));
        }
        return list;
    }
}

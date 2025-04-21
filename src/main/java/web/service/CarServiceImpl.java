package web.service;

import java.util.List;
import web.model.Car;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;

@Service
public class CarServiceImpl implements CarService {
    private CarDao cars;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.cars = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.getCarlist(count);
    }
}

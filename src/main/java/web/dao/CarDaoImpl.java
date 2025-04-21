package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(new Car("Nissan", 156, "blue"));
        list.add(new Car("Peugeot", 453, "gray"));
        list.add(new Car("Kia", 674, "gray"));
        list.add(new Car("Lada", 237, "white"));
        list.add(new Car("Hyundai", 633, "черный"));
    }

    @Override
    public List<Car> getCarlist(int count) {
        return list.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}

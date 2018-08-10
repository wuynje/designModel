package factoryModel.FactoryMethod;

import factoryModel.BigCar;
import factoryModel.Car;

public class BigCarFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new BigCar();
    }
}

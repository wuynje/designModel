package factoryModel.FactoryMethod;

import factoryModel.Car;
import factoryModel.SmallCar;

public class SmallCarFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new SmallCar();
    }
}

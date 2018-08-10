package factoryModel.FactoryMethod;

import factoryModel.Car;
import factoryModel.MiddleCar;

public class MiddleCarFactory implements ICarFactory {
    @Override
    public Car getCar() {
        return new MiddleCar();
    }
}

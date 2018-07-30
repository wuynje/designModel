package factoryModel.easyFactory;

import factoryModel.Car;

public class Test {
    Car car = new EasyFactory().getCarInstance(1);
}
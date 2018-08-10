package factoryModel.FactoryMethod;

import factoryModel.Car;

public class Test {
    public static void main(String[] args) {
        ICarFactory smallCarFactory = new SmallCarFactory();
        Car sc = smallCarFactory.getCar();
        sc.run();
        ICarFactory bigCarFactory = new BigCarFactory();
        Car bc = bigCarFactory.getCar();
        bc.run();
        ICarFactory middleCarFactory = new MiddleCarFactory();
        Car mc = middleCarFactory.getCar();
        mc.run();
    }
}

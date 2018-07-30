package factoryModel.easyFactory;

import factoryModel.BigCar;
import factoryModel.Car;
import factoryModel.MiddleCar;
import factoryModel.SmallCar;

/**
 * 简单工厂类，根据type返回对应的实例;
 * 扩展性比较差，需要新的类型实例，必须新增一种类型，修改工厂类代码
 *
 */
public class EasyFactory {
    public static Car getCarInstance(int type){
        switch (type){
            case 1:
                return new SmallCar();
            case 2:
                return new MiddleCar();
            default:
                return new BigCar();
        }
    }
}

package factoryModel.easyFactory;

import factoryModel.Car;

/**
 * 简单工厂模式（方法二）
 * 利用反射获取所需类的实例
 */
public class StaticFactory {
    public static  <T extends Car> T createCar(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}

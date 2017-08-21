package Task4_2_2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class[] myClass = new Class[]{int.class, int.class, int.class};
        Class aclass = Triangle.class;

        try {
            Constructor constr = aclass.getConstructor(myClass);
            Triangle triangle = (Triangle) constr.newInstance(20, 15, 10);
            Class[] parametrs = constr.getParameterTypes();

            for (Class parametr : parametrs) {
                System.out.println(parametr.getTypeName());
            }

            System.out.println(triangle);
            myClass=new Class[]{int.class};
            Method method = aclass.getMethod("setFirstsSide",myClass);
            method.setAccessible(true);
            method.invoke(triangle, 100);
            System.out.println(triangle);
        } catch (IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}


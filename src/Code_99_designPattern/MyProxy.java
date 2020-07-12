package Code_99_designPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {

    public static void main(String[] args) {
        MyInvokeHandler handler=new MyInvokeHandler(new Person());
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        Human p=(Human) handler.getProxy();
        p.say("the content");

    }
}

interface Human{
    void say(String word);
}
class Person implements Human{
    @Override
    public void say(String word) {
        System.out.println("被代理的对象说:"+word);
    }
}
class MyInvokeHandler implements InvocationHandler{
    private Object o;

    public MyInvokeHandler(Object o) {
        this.o = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result=method.invoke(o,args);
        System.out.println("after");
        return result;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Human.class.getClassLoader(),o.getClass().getInterfaces(),this);
    }


}



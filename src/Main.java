import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main{

}
interface CommonImpl{
    public void say();
}
class Target implements CommonImpl{
    @Override
    public void say() {
        System.out.println("say hello by origin target");
    }
}

class InvokeHandler implements InvocationHandler{
    public Object target;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("do something before");
        Object result=method.invoke(target,args);
        System.out.println("do something after");
        return result;
    }

    public Object getProxt(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),target.getClass().getInterfaces(),this);
    }
}
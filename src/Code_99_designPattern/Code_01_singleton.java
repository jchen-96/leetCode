package Code_99_designPattern;

public class Code_01_singleton {
    private volatile Code_01_singleton instance;

    private Code_01_singleton(){}

    private Code_01_singleton getInstance(){
        if(instance==null){
            synchronized (Code_01_singleton.class){
                if(instance==null)
                    instance=new Code_01_singleton();
                return instance;
            }
        }
        return instance;
    }
}

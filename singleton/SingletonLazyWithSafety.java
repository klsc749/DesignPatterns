package singleton;

public class SingletonLazyWithSafety{
    private static SingletonLazyWithSafety instance = null;
    private SingletonLazyWithSafety(){};

    public static SingletonLazyWithSafety getInstance(){
        if(instance == null){
            synchronized(SingletonLazyWithSafety.class){
                if(instance == null){
                    instance = new SingletonLazyWithSafety();                    
                }
            }
        }
        return instance;
    }
}
package singleton;


public class SingletonStarvation {
    private static SingletonStarvation instance = new SingletonStarvation();
    private SingletonStarvation(){};

    public static SingletonStarvation getInstance(){
        return instance;
    }
}
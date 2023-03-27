package singleton;

public class SingletonInClass {
    private SingletonInClass(){};

    private static class SingletonInClassHolder{
        private static SingletonInClass instance = new SingletonInClass();
    }

    public static SingletonInClass getInstance(){
        return SingletonInClassHolder.instance;
    }
}

# 静态工厂模式
静态工厂模式：用一个静态方法来对外提供自身实例的方法

本质作用： 能够增大类的提供者对**自己所提供的类的控制力**

## 1. 为什么要使用静态工厂模式

### 1.1 传统的构造函数

```java
public class Car {
    private String name;
    private String color;
    private int price;

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
```

```java
Car car = new Car("奔驰", "黑色", 100000);
```

### 1.2 静态工厂模式

```java
public class Car {
    private String name;
    private String color;
    private int price;

    private Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public static Car createCar(String name, String color, int price) {
        return new Car(name, color, price);
    }
}
```

```java
Car car = Car.createCar("奔驰", "黑色", 100000);
```
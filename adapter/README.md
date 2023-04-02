# 适配器模式

适配器模式(Adapter)通常也被称为转换器，顾名思义，它一定是进行适应与匹配工作的物件。当一个对象或类的接口不能匹配用户所期待的接口时，适配器就充当中间转换的角色，以达到兼容用户接口的目的，同时适配器也实现了客户端与接口的解耦，提高了组件的可复用性。

在本例中，我们使用适配器将新武器镭射枪适配到旧武器上，这样使得可以通过适配器像使用旧武器一样使用新武器。

## 对象适配器模式

对象适配器模式是通过组合的方式实现的，它将一个对象包装在另一个对象中，从而实现适配器的功能。

```java
public class Adapter implements OldWeapon {
    private NewWeapon newWeapon;

    public Adapter(NewWeapon newWeapon) {
        this.newWeapon = newWeapon;
    }

    @Override
    public void fire() {
        newWeapon.fire();
    }
}
```

## 类适配器模式

类适配器模式是通过继承的方式实现的，它将一个类的接口转换成客户希望的另一个接口，从而使原本由于接口不兼容而不能一起工作的那些类可以一起工作。

```java
public class Adapter extends NewWeapon implements OldWeapon {
    @Override
    public void fire() {
        super.fire();
    }
}
```

对象适配器模式与类适配器模式基本相同，二者的区别在于前者的Adaptee（被适配者）以接口形式出现并被Adapter（适配器）引用，而后者则以父类的角色出现并被Adapter（适配器）继承，所以前者更加灵活，后者则更为简便。其实不管何种模式，从本质上看适配器至少都应该具备模块两侧的接口特性，如此才能承上启下，促成双方的顺利对接与互动，
# 原型模式
原型模式达到以原型实例创建副本实例的目的即可，并不需要知道其原始类，也就是说，原型模式可以用对象创建对象，而不是用类创建对象，以此达到效率的提升。

> 从类到对象叫作“创建”，而由本体对象至副本对象则叫作“克隆”，当需要创建多个类似的复杂对象时，我们就可以考虑用原型模式。究其本质，克隆操作时Java虚拟机会进行内存操作，直接拷贝原型对象数据流生成新的副本对象，绝不会拖泥带水地触发一些多余的复杂操作（如类加载、实例化、初始化等），所以其效率远远高于“new”关键字所触发的实例化操作。看尽世间烦扰，拨开云雾见青天，有时候“简单粗暴”也是一种去繁从简、不绕弯路的解决方案。

## 浅拷贝问题

需要注意在实现Cloneable接口时会出现浅拷贝的问题。浅拷贝只是拷贝了对象的引用，而不是拷贝对象本身，所以在拷贝对象时，如果对象中的属性是引用类型，那么拷贝的对象和原始对象的属性引用的是同一个对象，这样就会出现问题。所以在实现Cloneable接口时，需要重写clone方法，实现深拷贝。

### 1. 浅拷贝
```java
public class Prototype implements Cloneable {
    private String name;
    private int age;
    private List<String> list;

    public Prototype(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
```
```java
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Prototype prototype = new Prototype("张三", 18, list);
        Prototype clone = prototype.clone();
        System.out.println(prototype == clone);
        System.out.println(prototype.getList() == clone.getList());
    }
}
```
输出结果：
```java
false
true
```
### 2. 深拷贝
```java
public class Prototype implements Cloneable {
    private String name;
    private int age;
    private List<String> list;

    public Prototype(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        List<String> list = new ArrayList<>();
        for (String s : this.list) {
            list.add(s);
        }
        prototype.setList(list);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
```
```java
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Prototype prototype = new Prototype("张三", 18, list);
        Prototype clone = prototype.clone();
        System.out.println(prototype == clone);
        System.out.println(prototype.getList() == clone.getList());
    }
}
```
输出结果：
```java
false
false
```

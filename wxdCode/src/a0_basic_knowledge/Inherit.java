package a0_basic_knowledge;

public class Inherit {
    public static void main(String[] args) {
        Cat c = new Cat("aaa", 5);
        c.meow();
        c.eat();
    }

}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public String getName() {
        return name;
    }
}

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Cat is meowing.");
    }

    // 方法重载
    @Override
    public void eat() {
        // 用super调用父类方法
        System.out.println(super.getName() + " is eating.");
    }
}

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}
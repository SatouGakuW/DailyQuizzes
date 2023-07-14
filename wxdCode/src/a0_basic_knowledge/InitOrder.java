package a0_basic_knowledge;

public class InitOrder {
    public static void main(String[] args) {

    }
}

class Animal2 {
    String name;
    int age;

    static {
        System.out.println("Animal static method");
    }

    public Animal2(){
        System.out.println("Animal无参构造");
    }

    public Animal2(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal有参构造");
    }

    public void eat() {
        System.out.println("Animal is eating.");
    }
}
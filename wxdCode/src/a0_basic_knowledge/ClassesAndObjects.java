package a0_basic_knowledge;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person = new Person(10, "aaa", "xxx");
        System.out.println(person.getAge());
    }
}

class Person {

    private int age;
    private String name;
    private String address;

    // 无参构造方法
    public Person(){

    }

    // 有参构造方法
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age, String name, String address) {
        // 必须放在第一行
        this(age, name);
        this.address = address;
    }

    public int getAge() {
        return age;
    }
}

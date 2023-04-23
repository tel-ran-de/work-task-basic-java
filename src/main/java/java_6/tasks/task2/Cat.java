package java_6.tasks.task2;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this(name);
        this.age = age;
        System.out.println("В конструкторе с двумя параметрами");
    }

    public Cat(String name) {
        this.name = name;
        System.out.println("В конструкторе с одним параметрами");
    }

    public Cat() {
        System.out.println("В конструкторе по умолчанию");
    }
}


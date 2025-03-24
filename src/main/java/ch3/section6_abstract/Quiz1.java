package ch3.section6_abstract;

abstract class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void makeSound();
}

interface Printable {
    void print();
}

class Dog extends Animal implements Printable {
    private String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public void print() {
        System.out.println("Dog - name: " + getName() + ", age: " + getAge() + ", breed: " + breed);
    }

    public void fetch() {
        System.out.println("fetching...");
    }
}

class Cat extends Animal implements Printable {
    private String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("야옹");
    }

    @Override
    public void print() {
        System.out.println("Cat - name: " + getName() + ", age: " + getAge() + ", color: " + color);
    }

    public void climb() {
        System.out.println("climbing...");
    }
}

class Document implements Printable {
    private String title;
    private String content;

    Document (String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }
    public String getContent() {
        return content;
    }

    @Override
    public void print() {
        System.out.println("title: " + getTitle());
        System.out.println("content: " + getContent());
    }
}

public class Quiz1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog", 4, "dogg");
        Cat cat1 = new Cat("cat", 5, "white");
        Document doc1 = new Document("titlele", "conntents");

        dog1.print();
        cat1.print();
        doc1.print();

        dog1.fetch();
        cat1.climb();

        dog1.makeSound();
        cat1.makeSound();
    }
}

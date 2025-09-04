package Constructor.Level_1;


public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aarav", 22);
        Person p2 = new Person(p1); 

        System.out.println("Original:");
        p1.display();
        System.out.println("Cloned:");
        p2.display();
    }
}


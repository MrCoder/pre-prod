public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        // feature bread sets name to upper case
        this.name = name.toUpperCase();
        // feature cheese doubles the age
        this.age = age * 2;
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

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        person1.sayHello();
        person2.sayHello();

        person1.setName("Carol");
        person2.setAge(35);

        person1.sayHello();
        person2.sayHello();
    }
}


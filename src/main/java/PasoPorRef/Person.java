package PasoPorRef;

public class Person {
    public String name;
    public String lastName;
    public int age;

    public Person() {
        this.name = "Silvestre";
        this.lastName = "Dangond";
        this.age = 30;
    }

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }


    public void changeNamePerson(String newName) {
        this.name =newName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + name + '\'' +
                ", Lastname='" + lastName + '\'' +
                ", Age=" + age +
                '}';
    }
}

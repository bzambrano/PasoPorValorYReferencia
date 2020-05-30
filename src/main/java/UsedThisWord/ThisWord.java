package UsedThisWord;

public class ThisWord {

    public static void main(String[] args) {
        Person person = new Person("Juancho");
        person.name="";
    }
}

class Person {
String name;
    public Person(String name) {
        this.name = name;
        System.out.println("print of operator this in person class: "+ this);
        ToPrint printObject = new ToPrint();
        printObject.print(this);//this contains the reference of person object
    }
}
class ToPrint {
    public void print(Person person){
        System.out.println("To print argument person "+ person);
        System.out.println("To print operator This "+ this);
    }
}

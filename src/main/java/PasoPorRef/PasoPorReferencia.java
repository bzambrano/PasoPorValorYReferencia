package PasoPorRef;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Person person = new Person();
        person.changeNamePerson("Juan");
        System.out.println("The name person is ".concat(person.getName()));
        System.out.println(person.toString());

        modifyObject(person);
        System.out.println("The new name of person is ".concat(person.getName()));
        System.out.println(person.toString());
    }

    private static void modifyObject(Person personArg) {
        personArg.changeNamePerson("Carlos");
    }


}


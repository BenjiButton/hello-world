package sample;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        Person person = new Person();
        person.setFirstName("Benji");
        person.setLastName("Button");
        System.out.println(String.format("Hello, %s", person.getFullName()));
    }
}

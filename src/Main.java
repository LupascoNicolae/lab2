public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25);
        Address address = new Address("123 Main St", "Cityville");
        Book book = new Book("Java Programming", "Jane Smith");
        Car car = new Car("Toyota", "Camry", 2022);

        System.out.println("Initial values:");
        System.out.println("Person: " + person);
        System.out.println("Address: " + address);
        System.out.println("Book: " + book);
        System.out.println("Car: " + car);

        // Modificarea valorilor cu ajutorul setter-ilor
        person.setName("Jane Doe");
        address.setStreet("456 Oak St");
        book.setAuthor("John Johnson");
        car.setModel("Corolla");

        System.out.println("\nUpdated values:");
        System.out.println("Person: " + person);
        System.out.println("Address: " + address);
        System.out.println("Book: " + book);
        System.out.println("Car: " + car);
    }
}
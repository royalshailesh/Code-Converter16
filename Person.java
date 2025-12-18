public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30, "john@example.com");

        System.out.println("Person Information:");
        System.out.println("==================");
        person1.displayInfo();

        System.out.println("\nUpdating information...");
        person1.setAge(31);
        person1.setEmail("john.doe@newmail.com");

        System.out.println("\nUpdated Information:");
        System.out.println("===================");
        person1.displayInfo();
    }
}
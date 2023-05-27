package unit12.inheritance1;

public class Person {
    String firstName;
    String lastName;
    int age;
    char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    String toEMail(String domainName) {
        return firstName + "." + lastName + "@" + domainName;
    }

    void printPerson() {
        System.out.println(firstName + " " + lastName + age + gender);
    }
}

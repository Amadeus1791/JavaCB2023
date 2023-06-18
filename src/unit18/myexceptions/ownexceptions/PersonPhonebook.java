package unit18.myexceptions.ownexceptions;

import java.util.ArrayList;
import java.util.List;

public class PersonPhonebook {
    private List<Person> persons;
    private final int DEFAULTLENGTH = 1000;

    public PersonPhonebook() {
        persons = new ArrayList<>();
    }

    public void addNewPerson(String name) {
        try {
            Person newPerson = new Person(name);
        } catch (StringLengthException e) {
         //   System.out.println("Your string is too long");
        }

    }

}

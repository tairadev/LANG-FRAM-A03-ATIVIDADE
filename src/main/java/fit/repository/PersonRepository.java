package fit.repository;

import java.util.ArrayList;
import java.util.List;

import fit.domain.Person;

public class PersonRepository {
    private List<Person> people;

    public PersonRepository() {
        super();
        people = new ArrayList<Person>();
        people.add(new Person("default", 0, "f"));
    }

    public List<Person> getAll() {
        return people;
    }

    public List<Person> add(Person person) {
        people.add(person);

        return people;
    }
}

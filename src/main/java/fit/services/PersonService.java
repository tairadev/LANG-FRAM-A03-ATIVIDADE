package fit.services;

import java.util.List;

import fit.domain.Person;
import fit.repository.PersonRepository;

public class PersonService {
    private PersonRepository repo;

    public PersonService() {
        super();
        repo = new PersonRepository();
    }

    public List<Person> add(Person person) {
        repo.add(person);

        return repo.getAll();
    }

    public List<Person> getAll() {
        return repo.getAll();
    }
}

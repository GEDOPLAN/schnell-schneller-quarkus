package de.gedoplan.showcase.ssq.jee.persistence;

import de.gedoplan.showcase.ssq.jee.domain.Person;
import de.gedoplan.showcase.ssq.jee.persistece.PersonRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Priority;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
@Alternative
@Priority(1)
public class PersonRepositoryMock extends PersonRepository {

  private Person[] persons = {
    new Person("Hugo", LocalDate.of(1998, 1, 15)),
    new Person("Otto", LocalDate.of(2002, 2, 10))
  };

  @Override
  public List<Person> findAll() {
    return Arrays.asList(this.persons);
  }

  @Override
  public void persist(Person person) {
    throw new UnsupportedOperationException();
  }

  @Override
  public Person findById(Integer id) {
    throw new UnsupportedOperationException();
  }

}

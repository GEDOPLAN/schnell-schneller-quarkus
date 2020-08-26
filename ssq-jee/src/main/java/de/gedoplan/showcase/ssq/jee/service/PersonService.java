package de.gedoplan.showcase.ssq.jee.service;

import de.gedoplan.showcase.ssq.jee.domain.Person;
import de.gedoplan.showcase.ssq.jee.persistece.PersonRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class PersonService {

  @Inject
  PersonRepository personRepository;

  public double getAverageAge() {
    double totalAge = 0;
    int count = 0;
    for (Person person : this.personRepository.findAll()) {
      ++count;
      totalAge += person.getAge();
    }
    return totalAge / count;
  }
}

package de.gedoplan.showcase.ssq.jee.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PersonServiceTest {

  @Inject
  PersonService personService;

  @Test
  void testGetAverageAge() {
    assertEquals(20, this.personService.getAverageAge(), 0.1);
  }
}

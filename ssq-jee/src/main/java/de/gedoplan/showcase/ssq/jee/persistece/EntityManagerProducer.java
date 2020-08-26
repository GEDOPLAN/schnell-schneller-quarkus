package de.gedoplan.showcase.ssq.jee.persistece;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EntityManagerProducer {

  @PersistenceContext
  @Produces
  EntityManager entityManager;
}

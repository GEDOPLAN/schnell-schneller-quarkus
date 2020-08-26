package de.gedoplan.showcase.ssq.jee.rest;

import de.gedoplan.showcase.ssq.jee.domain.Person;
import de.gedoplan.showcase.ssq.jee.persistece.PersonRepository;
import de.gedoplan.showcase.ssq.jee.service.PersonService;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("person")
public class PersonEndpoint {

  @Inject
  PersonRepository personRepository;

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<Person> get() {
    return this.personRepository.findAll();
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public Response post(Person person, @Context UriInfo uriInfo) {
    if (person.getId() != null) {
      throw new BadRequestException("Id must not be set");
    }

    this.personRepository.persist(person);

    URI uri = uriInfo
      .getAbsolutePathBuilder()
      .path(person.getId().toString())
      .build();
    return Response
      .created(uri)
      .build();
  }

  @Inject
  PersonService personService;

  @Path("avgAge")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public double getAverageAge() {
    return this.personService.getAverageAge();
  }

  @Path("count")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public int getCount() {
    return this.personService.getCount();
  }
}

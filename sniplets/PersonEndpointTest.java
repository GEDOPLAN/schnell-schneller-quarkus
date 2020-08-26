package de.gedoplan.showcase.ssq.jee.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PersonEndpointTest {

  @Test
  void testGetCount() {
    given()
      .when().get("/person/count")
      .then()
      .statusCode(200)
      .body(is("2"));
  }
}

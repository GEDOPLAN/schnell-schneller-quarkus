package de.gedoplan.showcase.rest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PersonEndpointTest {

  @Test
  void testGetAverageAge() {
    given()
      .when().get("/person/avgAge")
      .then()
      .statusCode(200)
      .body(is("21.0")); 
  }
}

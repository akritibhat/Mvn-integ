package com.example.webdevsummer12018;

import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = { DemoApplicationTests.class })
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class DemoIntegTest {
	 
		@Test
	    public void sampleIntegrationTest() {
	        Assert.assertFalse(false);
	    }
		
		 @Test
		  public void shouldRetrieveAnEventById() {
		    String body = RestAssured.given().
		        accept(ContentType.JSON).
		      when().
		        get("/api/entities/blah").
		      then().
		        statusCode(HttpStatus.SC_OK).
		        contentType(ContentType.JSON).
		        extract().asString();
		    Assert.assertThat(body, Matchers.equalTo("Retrieved entity with id: blah"));
		  }
}

 

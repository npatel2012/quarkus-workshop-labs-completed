package org.acme.people;

import javax.inject.Inject;

import org.acme.people.service.GreetingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingServiceTest {

    private static final Logger LOGGER = LoggerFactory.getLogger("GreetingServiceTest");

    @Inject 
    GreetingService service;

    // Testing actual GreetingService
    // @Test
    // public void testGreetingService() {
    //     Assertions.assertTrue(service.greeting("Quarkus").startsWith("hello Quarkus"));
    // }

    // Testing the mocked GreetingService here
    @Test
    public void testGreetingService() {
        LOGGER.info("greeting: " + service.greeting("Quarkus"));
        Assertions.assertTrue(service.greeting("Quarkus").startsWith("hello Quarkus"));
    }

}
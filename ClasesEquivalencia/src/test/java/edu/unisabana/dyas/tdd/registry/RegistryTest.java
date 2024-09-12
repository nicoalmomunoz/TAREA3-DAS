package edu.unisabana.dyas.tdd.registry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for the Registry class.
 */
public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {
        Person person = new Person("John Doe", 123456, 30, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.VALID, result);
    }

    // TODO: Complete with more test cases for different equivalence classes
}

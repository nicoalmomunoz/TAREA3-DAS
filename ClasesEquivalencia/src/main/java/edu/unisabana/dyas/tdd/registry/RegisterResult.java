package edu.unisabana.dyas.tdd.registry;

/**
 * Enumeration to represent the result of registering a voter.
 */
public enum RegisterResult {
    DEAD, // When the person is not alive
    UNDERAGE, // When the person is under the voting age
    INVALID_AGE, // When the person has an invalid age (too young or too old)
    VALID, // When the person is eligible to vote
    DUPLICATED // When the person's ID has already been registered
}

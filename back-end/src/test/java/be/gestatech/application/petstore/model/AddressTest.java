package be.gestatech.application.petstore.model;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import org.junit.Test;

public class AddressTest {

    // ======================================
    // =              Methods               =
    // ======================================

    @Test
    public void shouldCheckEqualsAndHashCode() {

        // Checks equals and hashCode is valid
        EqualsVerifier.forClass(Address.class).suppress(Warning.NONFINAL_FIELDS).verify();
    }
}
package java;

import java.Voiture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VoitureTest {

    private Voiture voiture = new Voiture("test",13.5);

    @Test
    void when_getMarque_should_return_correct_marque(){
        Assertions.assertEquals("test", voiture.getMarque());

    }
    @Test
    void when_getPrix_should_return_correct_prix(){
        assertEquals(13.5, voiture.getPrix());
    }

    @Test
    void when_getPrix_should_return_false_prix(){
        assertNotEquals(13, voiture.getPrix());
    }

    @Test
    void when_getMarque_should_return_false_marque(){
        assertNotEquals("ferrari", voiture.getMarque());
    }

    @Test
    void when_toString_should_return_correct_string(){
        assertEquals("La voiture coûte 13.5 et est de marque test", voiture.toString());
    }

}

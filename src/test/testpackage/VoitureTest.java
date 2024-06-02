package testpackage;

import mainpackage.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VoitureTest {

    private Voiture voiture = new Voiture("test",13.5);

    @Test
    void when_getMarque_should_return_correct_marque(){
        assertEquals("test", voiture.getMarque());

    }
    @Test
    void when_getPrix_should_return_correct_prix(){
        assertEquals(13.5, voiture.getPrix());

    }


}

package testpackage;

import mainpackage.StatistiqueVoiture;
import mainpackage.Voiture;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class StatistiqueVoitureTest {

    private StatistiqueVoiture stv= new StatistiqueVoiture();

    @Test
    void when_prix_should_return_incorrect_prix(){
        /*Voiture v1 = new Voiture("v1",1000);
        stv.ajouter(v1);
        assertNotEquals(1300, stv.prix());*/
    }

    @Test
    void when_prix_should_return_error(){
        stv.prix();
    }

}

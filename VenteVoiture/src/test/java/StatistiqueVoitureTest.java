package java;

import java.StatistiqueVoiture;

import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;



@Suite
@SuiteDisplayName("JUnit Suite")
@IncludeClassNamePatterns(".*Tests")
class StatistiqueVoitureTest {
    /* Ecrire suite de tests pour tp3*/

    private StatistiqueVoiture stv= new StatistiqueVoiture();

    @Test
    void when_prix_should_return_incorrect_prix(){
        /*Voiture v1 = new Voiture("v1",1000);
        stv.ajouter(v1);
        assertNotEquals(1300, stv.prix());*/
    }

    @Test
    void when_prix_should_return_error(){

    }

}

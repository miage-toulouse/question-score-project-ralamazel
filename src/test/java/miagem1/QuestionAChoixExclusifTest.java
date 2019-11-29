package miagem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class QuestionAChoixExclusifTest {

    private QuestionAChoixExclusif question;

    @Before
    public void setUp() throws Exception {
        // given
        question =  new QuestionAChoixExclusif("enonce",2);
    }

    @Test
    public void testGetEnonce() {
        String enonce = question.getEnonce();
        assertEquals("enonce", enonce);

    }

    @Test
    public void testGetScoreForIndiceBonneReponse() {
        int indiceEtudiant = 2;
        float resultat = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(100f ,resultat,0.01f);
    }

    @Test
    public void testGetScoreForIndiceMauvaiseReponse() {
        int indiceEtudiant = 1;
        float resultat = question.getScoreForIndice(indiceEtudiant);
        // then : le score obtenu est 100
        assertEquals(0f ,resultat,0.01f);
    }
}

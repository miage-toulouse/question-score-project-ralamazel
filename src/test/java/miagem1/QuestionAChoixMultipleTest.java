package miagem1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private QuestionAChoixMultiple question;

    @Before
    public void setUp() throws Exception {
        // given
        ArrayList<Integer> listIndice = new ArrayList<Integer>();
        listIndice.add(1);
        listIndice.add(2);
        question =  new QuestionAChoixMultiple("enonce",listIndice);
    }

    @Test
    public void getEnonce() {
        String enonce = question.getEnonce();
        assertEquals("enonce",enonce);
    }

    @Test
    public void getScoreForIndiceBonneReponse() {
        int indiceEtudiant = 1;
        float resultat = question.getScoreForIndice(indiceEtudiant);
        assertEquals(50f ,resultat,0.01f);
    }

    @Test
    public void getScoreForIndiceMauvaiseReponse() {
        int indiceEtudiant = 3;
        float resultat = question.getScoreForIndice(indiceEtudiant);
        assertEquals(0f ,resultat,0.01f);
    }

}
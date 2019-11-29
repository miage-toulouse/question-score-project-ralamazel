package miagem1;

import java.util.List;

/**
 * Created by franck on 28/11/2016.
 */
public class ScoreCalculateur {

    /**
     * Calcule le score obtenu par un étudiant en répondant à une question à choix
     *
     * @return le score compris entre 0 et 100
     */
    float calculeScore(List<Integer> indicesReponseEtudiant, QuestionAChoix question) {
        float score = 0 ;

        for (int indice:indicesReponseEtudiant) {
            if(question.getScoreForIndice(indice) == 0){
                score -=50f;
            }
            score += question.getScoreForIndice(indice);
        }

        if (score<=0){
            return 0;
        }
        return score;
    }



}

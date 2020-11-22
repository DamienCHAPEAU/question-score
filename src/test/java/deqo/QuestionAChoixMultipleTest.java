package deqo;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class QuestionAChoixMultipleTest {

    private String enonce;
    private List<Integer> indicesBonnesReponses;
    private QuestionAChoixMultiple QACM;

    @Before
    public void setUp() throws Exception {
        enonce = "enonce test";
        indicesBonnesReponses = new ArrayList<Integer>();
        indicesBonnesReponses.add(1);
        indicesBonnesReponses.add(2);
        indicesBonnesReponses.add(3);
        QACM = new QuestionAChoixMultiple(enonce,indicesBonnesReponses);
    }

    @Test
    public void getEnonce() {
        assertEquals("enonce test",QACM.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        assertEquals(100f / ((float) (indicesBonnesReponses.size())),QACM.getScoreForIndice(1),0);
        assertEquals(0,QACM.getScoreForIndice(5),0);
    }
}
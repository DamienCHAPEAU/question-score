package deqo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {

    private String enonce;
    private int indice;
    private QuestionAChoixExclusif QACE;

    @Before
    public void setUp() throws Exception {
        QACE = new QuestionAChoixExclusif("Enonce Test",1);
    }

    @Test
    public void getEnonce() {
        assertEquals("Enonce Test",QACE.getEnonce());
    }

    @Test
    public void getScoreForIndice() {
        assertEquals(100,QACE.getScoreForIndice(1),0);
        assertEquals(0,QACE.getScoreForIndice(3),0);
    }
}
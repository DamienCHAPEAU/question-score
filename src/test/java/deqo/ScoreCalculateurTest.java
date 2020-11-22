package deqo;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ScoreCalculateurTest {

    private QuestionAChoixMultiple questionAChoixMultiple;
    private List<Integer> liste1;
    private List<Integer> liste2;
    private List<Integer> liste3;

    @Before
    public void setUp() throws Exception {
        questionAChoixMultiple = new QuestionAChoixMultiple("q1",new ArrayList<Integer>(Arrays.asList(2,3,5)));
        liste1 = new ArrayList<Integer>(Arrays.asList(1,4));
        liste2 = new ArrayList<Integer>(Arrays.asList(2,3));
        liste3 = new ArrayList<Integer>(Arrays.asList(2,3,5));
    }

    @Test
    public void calculeScore() {

    }
}
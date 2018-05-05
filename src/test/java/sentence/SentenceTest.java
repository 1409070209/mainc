package sentence;

import org.junit.Test;

public class SentenceTest {
    @Test
    public void analysis() throws Exception {
        Sentence sentence = new Sentence("int a = b + c");
        System.out.println(sentence.toString());
    }

}
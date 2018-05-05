package paragraph;

import buffer.BufferMap;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphTest {
    @Test
    public void testCreateSentence () throws Exception {
        String string = "int a = 123;ArrayInt b = [1,2,3,4];ArrayString c = [\"123\",\"雷诺\"];string d = \"123\"";
        Paragraph paragraph = new Paragraph(string);
        System.out.println(paragraph);
        System.out.println(new BufferMap());
    }
}
package paragraph;

import sentence.Sentence;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UPCdevelopment
 */
public class Paragraph {
    private String paragraph;

    private List<Sentence> sentenceList;

    public List<Sentence> createSentence(String paragraph) throws Exception {
        List<Sentence> sentences = new ArrayList<>();
        String splitChar = ";";
        for (String s : paragraph.split(splitChar)) {
            sentences.add(new Sentence(s));
        }
        return sentences;
    }

    public Paragraph(String paragraph) throws Exception {
        this.paragraph = paragraph;
        this.sentenceList = this.createSentence(this.paragraph);
    }

    public String getParagraph() {
        return paragraph;
    }

    public void setParagraph(String paragraph) {
        this.paragraph = paragraph;
    }

    @Override
    public String toString() {
        return "代码段落{" +
                "paragraph='" + paragraph + '\'' +
                ", sentenceList=" + sentenceList +
                '}';
    }
}

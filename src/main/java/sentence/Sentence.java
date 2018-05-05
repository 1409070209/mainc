package sentence;

import buffer.BufferMap;
import buffer.Variable;
import enums.GrammarEnum;

/**
 * @author leinuoleileinuo
 */
public class Sentence {

    private String sentence;

    private String functionName = null;

    private String type = null;

    private String name;

    private String valueSentence = null;

    public void analysis() throws Exception {
        String[] sentences = this.sentence.split("=");
        if (sentences.length <= 1) {
            throw new Exception(GrammarEnum.GRAMMAR_MISTAKES + this.sentence);
        }
        this.valueSentence = sentences[1];
        String[] typeList = sentences[0].split(" ");
        if (typeList.length <= 1) {
            throw new Exception(GrammarEnum.GRAMMAR_MISTAKES + this.sentence);
        }
        this.name = typeList[1];
        this.type = typeList[0];
        new BufferMap().setVariable(name , new Variable(type , valueSentence));
    }
    public Sentence(String sentence) throws Exception {
        this.sentence = sentence;
        this.analysis();
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    @Override
    public String toString() {
        return "Sentence{" +
                "sentence='" + sentence + '\'' +
                ", functionName='" + functionName + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", valueSentence='" + valueSentence + '\'' +
                '}';
    }
}

package buffer;

import enums.DataTypeEnum;
import org.junit.Test;

public class BufferMapTest {
    @Test
    public void setVariable() throws Exception {
        BufferMap bufferMap = new BufferMap();
        Variable variable = new Variable(DataTypeEnum.ARRAYING , "[1,2,3,4]");
        bufferMap.setVariable("a" , variable);
        System.out.println(bufferMap.toString());
    }
    @Test
    public void test() throws Exception {
        Variable arrayInt = new Variable(DataTypeEnum.ARRAYING, "[1,2,3,4]");
        Variable arrayString = new Variable(DataTypeEnum.ARRAY_STRING, "[\"132\" , \"123\"]");
        Variable integer = new Variable(DataTypeEnum.INTEGER , "123331");
        Variable string = new Variable(DataTypeEnum.STRING , "雷诺");

        BufferMap bufferMap = new BufferMap();
        bufferMap.setVariable(Double.valueOf(Math.random()).toString() , arrayInt);
        bufferMap.setVariable(Double.valueOf(Math.random()).toString() , arrayString);
        bufferMap.setVariable(Double.valueOf(Math.random()).toString() , integer);
        bufferMap.setVariable(Double.valueOf(Math.random()).toString() , string);
        System.out.println(bufferMap.toString());
    }

}
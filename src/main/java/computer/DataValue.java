package computer;

import data.ArrayInt;
import data.ArrayString;

import java.util.List;

/**
 * @author UPCdevelopment
 * //TODO 完善计算表达式功能
 */
public class DataValue {
    public static List<Integer> arratInt(String value) {
        return ArrayInt.getValue(value);
    }
    public static List<String> arrayString(String value) {
        return ArrayString.getValue(value);
    }
}

package data;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UPCdevelopment
 */
public class ArrayInt {

    public static List<Integer> getValue (String value) {
        List<String> list = ArrayString.getValue(value);
        List<Integer> integerList = new ArrayList<>();
        for (String s : list) {
            integerList.add(Integer.parseInt(s));
        }
        return integerList;
    }
}

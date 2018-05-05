package data;

import net.sf.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * @author UPCdevelopment
 */
public class ArrayString {
    public static List<String> getValue (String value) {
        List<String> integerList = new ArrayList<>();
        JSONArray jsonArray =  JSONArray.fromObject(value);
        Object[] objects = jsonArray.toArray();
        for (Object object : objects) {
            integerList.add(String.valueOf(object));
        }
        return integerList;
    }
}

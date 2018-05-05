package buffer;

import enums.BufferEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author UPCdevelopment
 */
public class BufferMap {
    private static Map<String , Variable> bufferMap = new HashMap<>();

    public Variable getVariable(String name) throws Exception {
        if (!bufferMap.containsKey(name)) {
            throw new Exception(BufferEnum.VARIABLE_UNDEFINED + name);
        }
        return bufferMap.get(name);
    }

    public void setVariable(String name , Variable variable) throws Exception {
        if (bufferMap.containsKey(name)) {
            throw new Exception(BufferEnum.REPEATED_VARIABLE + name);
        }
        bufferMap.put(name , variable);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String key : bufferMap.keySet()) {
            Variable value = bufferMap.get(key);
            result.append(value.getType()).append(" ").append(key).append(" = ").append(value.getValue()).append('\n');
        }
        return result.toString();
    }
}

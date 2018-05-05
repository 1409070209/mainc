package buffer;

import enums.DataTypeEnum;

import java.util.Objects;

/**
 * @author UPCdevelopment
 */
public class Variable {
    private String type;

    private String value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Variable(String type, String value) {
        this.type = type;
        this.value = value;
    }
}

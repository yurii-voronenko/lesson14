package cc.robotdreams.types;

import cc.robotdreams.base.DataType;

import java.util.regex.Pattern;

public class IntType extends DataType
{
    private Integer value;

    public IntType(String value) {
        super(value);
    }

    @Override
    public String getTypeName() {
        return "integer";
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    protected void setValue(String value) {
        if (value == null || value.isEmpty()) {
            this.value = 0;
            return;
        }
        if (Pattern.compile("^([\\d-]+)$").matcher(value).matches())
            this.value = Integer.valueOf(value);
        else
            this.value = 0;
    }

    @Override
    public void add(String value) {
        if (value == null || value.isEmpty())
            return;
        if (Pattern.compile("^([\\d-]+)$").matcher(value).matches())
            this.value += Integer.parseInt(value);
    }
}

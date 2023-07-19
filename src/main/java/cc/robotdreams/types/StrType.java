package cc.robotdreams.types;

import cc.robotdreams.base.DataType;

public class StrType extends DataType
{
    private String value;


    public StrType(String value) {
        super(value);
    }

    @Override
    public String getTypeName() {
        return "string";
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    protected void setValue(String value) {
        if (value == null || value.isEmpty())
            return;
        this.value = value;
    }

    @Override
    public void add(String value) {
        if (value == null || value.isEmpty())
            return;
        this.value += value;
    }
}

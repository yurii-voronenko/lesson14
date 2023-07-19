package cc.robotdreams.base;

import cc.robotdreams.iface.Vehicle;

abstract public class DataType implements DataTypeIface
{
    public DataType(String value) {
        this.setValue(value);
    }

    @Override
    public String toString() {
        return String.format("Type: %s, Value: %s", getTypeName(), getValue().toString());
    }

    abstract protected void setValue(String value);
}

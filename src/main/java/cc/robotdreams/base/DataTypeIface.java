package cc.robotdreams.base;

public interface DataTypeIface  // able, ible - examples: Closeable, Iterable
                                // noun - DataType, Apple
{
    // all methods abstract public
    String getTypeName();
    Object getValue();
    void add(String value);
}

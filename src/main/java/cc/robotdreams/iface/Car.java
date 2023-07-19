package cc.robotdreams.iface;

public interface Car extends Vehicle
{
    final static public String TYPE_NAME = "CAR";

    String getFuelType();
    float getEngineCapacity();

    @Override
    default String getType() {
        return TYPE_NAME;
    }

    default String getDetails() {
        return String.format("Type: %s, Fuel type: %s, Engine capacity: %f", getType(), getFuelType(), getEngineCapacity());
    }
}

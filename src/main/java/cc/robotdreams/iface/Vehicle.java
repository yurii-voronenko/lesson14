package cc.robotdreams.iface;

public interface Vehicle
{
    String getType();
    void move(int pointA, int pointB);
    int getPassengersSeatsCount();
}

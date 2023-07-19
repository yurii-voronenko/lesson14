package cc.robotdreams.cars;

import cc.robotdreams.iface.Car;

public class Truck implements Car
{
    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public float getEngineCapacity() {
        return 5.0f;
    }

    @Override
    public void move(int pointA, int pointB) {
        /* ... */
    }

    @Override
    public int getPassengersSeatsCount() {
        return 1;
    }
}

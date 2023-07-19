package cc.robotdreams.cars;

import cc.robotdreams.iface.Car;

public class PassengerCar implements Car
{
    @Override
    public String getFuelType() {
        return "Gas";
    }

    @Override
    public float getEngineCapacity() {
        return 2.0f;
    }

    @Override
    public void move(int pointA, int pointB) {
        /* ... */
    }

    @Override
    public int getPassengersSeatsCount() {
        return 4;
    }
}


package cc.robotdreams;

import cc.robotdreams.base.DataTypeIface;
import cc.robotdreams.cars.PassengerCar;
import cc.robotdreams.cars.Truck;
import cc.robotdreams.types.IntType;
import cc.robotdreams.types.StrType;

public class Main
{
    public static void main(String[] args) {
        DataTypeIface strType = new StrType("StringValue");
        strType.add("ConcatenateValue");
        System.out.println(strType);
        DataTypeIface intType = new IntType("10");
        intType.add("5");
        System.out.println(intType);


        PassengerCar passengerCar = new PassengerCar();
        Truck        truck        = new Truck();

        System.out.println(passengerCar.getDetails());
        System.out.println(truck.getDetails());
    }

}
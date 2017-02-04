/**
* This is a simulation transport manager.
*/
public class TransportManager
{
    public static void main(String[] args)
    {
        /** out:
         * You rented a BIG TRUCK: 
         * Cargo delivery.
         * The tonnage of 10 tons. 
         * Speed: 90 km/h.
         * Gear: 7.
         * * * * * * * * * * * * *
         * Average speed: 90 km/h.
         * Gear: 5.
         */
        System.out.println("You rented a BIG TRUCK:");
        Truck truck = new Truck(90, 7, 10);
        truck.transportCargo();
        truck.printStates();
        truck.changeGear(5);
        truck.printStates();
        

        /** out:
         * You rented a CAR: 
         * Transportation of 4 passengers. 
         * Speed: 120 km/h.
         * Gear: 5.
         */
        System.out.println("You rented a CAR:");
        Car car = new Car(120, 5, 4);
        car.transportPassangers();
        car.printStates();

        /** out:
         * You rented a PICKUP: 
         * Transportation of 3 passengers. 
         * Cargo delivery.
         * The tonnage of 5 tons.
         * Speed: 100 km/h.
         * Gear: 5.
         */
        System.out.println("You rented a PICKUP:");
        Pickup pickup = new Pickup(100, 5, 3, 5);
        pickup.transportPassangers();
        pickup.transportCargo();
        pickup.printStates();
    }
}
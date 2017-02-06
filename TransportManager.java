/**
* This is a simulation transport manager.
*/
public class TransportManager
{
    public static void main(String[] args)
    {
        /** out:
         * It is a BIG TRUCK:
         * Cargo delivery.
         * The tonnage of 20 tons.
         * Speed: 0 km/h.
         * * * * * * * * * * * * * * * * *
         * It is a BIG TRUCK:
         * Cargo delivery.
         * The tonnage of 20 tons.
         * Speed: 50 km/h.
         * * * * * * * * * * * * * * * * *
         */
        Truck truck = new Truck();
        truck.printStates();
        for (int i = 0; i < 10; i++) {
            truck.speedUp();
        }
        truck.printStates();
        

        /** out:
         * It is a CAR:
         * Transportation of 5 passengers.
         * Speed: 0 km/h.
         * * * * * * * * * * * * * * * * *
         * It is a CAR:
         * Transportation of 5 passengers.
         * Speed: 100 km/h.
         * * * * * * * * * * * * * * * * *
         * It is a CAR:
         * Transportation of 5 passengers.
         * Speed: 50 km/h.
         * * * * * * * * * * * * * * * * *
         */
        Car car = new Car();
        car.printStates();
        for (int i = 0; i < 20; i++) {
            car.speedUp();
        }
        car.printStates();
        for (int i = 0; i < 10; i++) {
            car.speedDown();
        }
        car.printStates();

        /** out:
         * It is a PICKUP:
         * Cargo delivery.
         * The tonnage of 5 tons.
         * Transportation of 3 passengers.
         * Speed: 0 km/h.
         * * * * * * * * * * * * * * * * *
         * It is a PICKUP:
         * Cargo delivery.
         * The tonnage of 5 tons.
         * Transportation of 3 passengers.
         * Speed: 50 km/h.
         * * * * * * * * * * * * * * * * *
         */
        Pickup pickup = new Pickup();
        pickup.printStates();
        for (int i = 0; i < 10; i++) {
            pickup.speedUp();
        }
        pickup.printStates();
    }
}

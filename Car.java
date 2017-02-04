public class Car extends Vehicle implements PassangersAuto
{
    /**
     * @param num_passengers
     */
    private int num_passengers;

    /**
     * The Car class constructor
     */
    public Car(int average_speed, int gear, int num_passengers)
    {
        super(average_speed, gear);
        this.num_passengers = num_passengers;
    }

    /**
     * Transport passangers
     */
    public void transportPassangers()
    {
        System.out.println("Transportation of "
            + this.num_passengers + " passengers.");
    }
}
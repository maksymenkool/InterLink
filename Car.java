public class Car extends Vehicle implements PassangersAuto
{
    private int num_passengers;

    public Car(int average_speed, int gear, int num_passengers)
    {
        super(average_speed, gear);
        this.num_passengers = num_passengers;
    }

    public void transportPassangers()
    {
        System.out.println("Transportation of "
            + this.num_passengers + " passengers.");
    }
}
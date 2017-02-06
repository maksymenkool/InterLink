public class Car extends Vehicle implements PassangersAuto
{
    private static final int MAX_SPEED = 240;

    /**
     * The Car class constructor
     */
    public Car()
    {
        super.setMaxSpeed(MAX_SPEED);
    }

    /**
     * Transport passangers
     */
    public void transportPassangers()
    {
        System.out.println("It is a CAR:\n"
            + "Transportation of 5 passengers.");
    }

    /**
     * Print states
     */
    void printStates()
    {
        this.transportPassangers();
        super.printStates();
    }
}

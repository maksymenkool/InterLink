public class Pickup extends Vehicle implements CargoAuto, PassangersAuto
{
    private static final int MAX_SPEED = 180;

    /**
     * The Pickup class constructor
     */
    public Pickup()
    {
        super.setMaxSpeed(MAX_SPEED);
    }

    /**
     * Transport cargo
     */
    public void transportCargo()
    {
        System.out.println("It is a PICKUP:\n"
            + "Cargo delivery.\n"
            + "The tonnage of 5 tons.");
    }

    /**
     * Transport passangers
     */
    public void transportPassangers()
    {
        System.out.println("Transportation of 3 passengers.");
    }

    /**
     * Print states
     */
    void printStates()
    {
        this.transportCargo();
        this.transportPassangers();
        super.printStates();
    }
}

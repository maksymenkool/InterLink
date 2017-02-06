public class Truck extends Vehicle implements CargoAuto
{
    private static final int MAX_SPEED = 140;

    /**
     * The Truck class constructor
     */
    public Truck()
    {
        super.setMaxSpeed(MAX_SPEED);
    }

    /**
     * Transport cargo
     */
    public void transportCargo()
    {
        System.out.println("It is a BIG TRUCK:\n"
            + "Cargo delivery.\n"
            + "The tonnage of 20 tons.");
    }

    /**
     * Print states
     */
    void printStates()
    {
        this.transportCargo();
        super.printStates();
    }
}

public class Pickup extends Vehicle implements CargoAuto, PassangersAuto
{
    /**
     * @param num_passengers
     */
    private int num_passengers;

    /**
     * @param cargo_weight
     */
    private int cargo_weight;

    /**
     * The Pickup class constructor
     */
    public Pickup(
        int average_speed,
        int gear,
        int num_passengers,
        int cargo_weight
    ) {
        super(average_speed, gear);
        this.num_passengers = num_passengers;
        this.cargo_weight = cargo_weight;
    }

    /**
     * Transport cargo
     */
    public void transportCargo()
    {
        System.out.println("Cargo delivery.\n"
            + "The tonnage of " + this.cargo_weight + " tons.");
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
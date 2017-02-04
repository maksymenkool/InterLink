public class Truck extends Vehicle implements CargoAuto
{
    /**
     * @param cargo_weight
     */
    private int cargo_weight;

    /**
     * The Truck class constructor
     */
    public Truck(int average_speed, int gear, int cargo_weight)
    {
        super(average_speed, gear);
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
}
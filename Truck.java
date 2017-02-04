public class Truck extends Vehicle implements CargoAuto
{
    private int cargo_weight;

    public Truck(int average_speed, int gear, int cargo_weight)
    {
        super(average_speed, gear);
        this.cargo_weight = cargo_weight;
    }
    
    public void transportCargo()
    {
        System.out.println("Cargo delivery.\n"
            + "The tonnage of " + this.cargo_weight + " tons.");
    }
}
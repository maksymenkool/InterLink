public class Vehicle
{
    private int speed = 0;
    private int gear = 1;
    
    /**
     * The Vehicle class constructor
     */
    public Vehicle(int average_speed, int gear)
    {
        this.speed = average_speed;
        this.gear = gear;
    }

    /**
     * Change gear
     * @param new_gear
     */
    void changeGear(int new_gear)
    {
         this.gear = new_gear;
    }

    /**
     * Speed up
     * @param increment
     */
    void speedUp(int increment)
    {
         this.speed = this.speed + increment;   
    }

    /**
     * Speed down
     * @param decrement
     */
    void speedDown(int decrement)
    {
         this.speed = this.speed - decrement;
    }

    /**
     * Print states
     */
    void printStates()
    {
         System.out.println("Average speed: " + this.speed
             + " km/h.\nGear: " + this.gear + ".\n"
             + "* * * * * * * * * * * * * * * *");
    }
}
public class Vehicle
{
    private static final int SPEED_STEP = 5;
    
    private int speed = 0;
    private int max_speed;

    /**
     * Change gear
     * @param new_gear
     */
    void setMaxSpeed(int max_speed)
    {
         this.max_speed = max_speed;
    }

    public int getMaxSpeed()
    {
        return this.max_speed;
    }

    /**
     * Speed up
     */
    void speedUp()
    {
        if (this.speed >= this.max_speed) return;
        this.speed += SPEED_STEP;
    }

    /**
     * Speed down
     */
    void speedDown()
    {
        if (this.speed == 0) return;
        this.speed -= SPEED_STEP;
    }

    /**
     * Print states
     */
    void printStates()
    {
         System.out.println("Average speed: " + this.speed
             + " km/h.\n" + "* * * * * * * * * * * * * * * *");
    }
}

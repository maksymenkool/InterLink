public class Vehicle
{
    private int speed = 0;
    private int gear = 1;
    
    public Vehicle(int average_speed, int gear)
    {
        this.speed = average_speed;
        this.gear = gear;
    }

    void changeGear(int new_gear)
    {
         this.gear = new_gear;
    }

    void speedUp(int increment)
    {
         this.speed = this.speed + increment;   
    }

    void speedDown(int decrement)
    {
         this.speed = this.speed - decrement;
    }

    void printStates()
    {
         System.out.println("Average speed: " + this.speed
             + " km/h.\nGear: " + this.gear + ".\n"
             + "* * * * * * * * * * * * * * * *");
    }
}
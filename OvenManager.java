/**
* This is a simulation oven works.
* Follow the instructions to prepare a meal.
*/
public class OvenManager
{
    public static void main(String[] args)
    {
        Oven oven = new Oven();

        oven.addMode();
        String mode = oven.getMode();
        oven.addTemp();
        int temp = oven.getTemp();
        oven.addTime();
        int time = oven.getTime();

        oven.printCook(mode, temp, time);
    }
}
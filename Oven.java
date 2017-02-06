import java.io.*;
import java.util.Scanner;

public class Oven
{
    private static final int MIN_TIME = 10;
    private static final int MAX_TIME = 180;
    private static final int MIN_TEMP = 60;
    private static final int MAX_TEMP = 240;

    /**
     * @param time the cooking time
     */
    private int time = 0;

    /**
     * @param temp the cooking temperature
     */
    private int temp = 0;

    /**
     * @param mode the cooking mode
     */
    private String mode;
    private String[] modes = {
        "Top heat",
        "Bottom heat",
        "Top and bottom heat",
        "Grill"
    };

    /**
     * Add the cooking mode
     */
    public void addMode ()
    {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int i;
            System.out.println("Select the cooking mode;\n"
                + "TOP HEAT - 1; \nBOTTOM HEAT - 2; \n"
                + "TOP and BOTTOM HEAT - 3;\nGRILL - 4.");
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                if (i >=1 && i<= 4) {
                    System.out.println("Thank you!");
                    this.mode = this.modes[i-1];
                } else {
                    System.out.println("Your selection is not correct.!");
                    this.addMode();
                }
            } else {
                System.out.println("Your selection is not correct.!");
                    this.addMode();
            }
        } finally {
            sc.close();
        }
    }

    /**
     * Get the cooking mode
     * @return String
     */
    public String getMode()
    {
        return this.mode;
    }

    /**
     * Add the cooking temperature
     */
    public void addTemp()
    {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int temp;
            System.out.println("Select the cooking temperature:\n"
                 + "The min temperature - " + this.MIN_TEMP + ";\n"
                 + "The max temperature - " + this.MAX_TEMP + ".");
            if (sc.hasNextInt()) {
                temp = sc.nextInt();
                if (temp >= this.MIN_TEMP && temp <= this.MAX_TEMP) {
                    System.out.println("Thank you!");
                    this.temp = temp;
                } else {
                    System.out.println("Your selection is not correct.!");
                    this.addTemp();
                }
            } else {
                System.out.println("Your selection is not correct.!");
                this.addTemp();
            }
        } finally {
            sc.close();
        }
    }

    /**
     * Get the cooking temperature
     * @return int
     */
    public int getTemp()
    {
        return this.temp;
    }

    /**
     * Add the cooking time
     */
    public void addTime()
    {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            int time;
            System.out.println("Select the cooking time;\n"
                + "The min time - " + this.MIN_TIME + " minutes;\n"
                + "The max time - " + this.MAX_TIME + " minutes.");
            if (sc.hasNextInt()) {
                time = sc.nextInt();
                if (time >= this.MIN_TIME && time <= this.MAX_TIME) {
                    System.out.println("Thank you!");
                    this.time = time;
                } else {
                    System.out.println("Your selection is not correct.!");
                    this.addTime();
                }
            } else {
                System.out.println("Your selection is not correct.!");
                this.addTime();
            }
        } finally {
            sc.close();
        }
    }

    /**
     * Get the cooking time
     * @return int
     */
    public int getTime()
    {
        return this.time;
    }
        
    public void printCook(String mode, int temp, int time)
    {
        System.out.println("I'm cooking ))\n"
            + "Cooking mode - " + mode + ".\n"
            + "Cooking temperature - " + temp + ".\n"
            + "Cooking time - " + time + ".\n"
            + "Bon Appetit!");
    }
}

package src;

// Program to find state of switch and change it if required

public class ElectricBulb {

    private String bulbColor;
    private String bulbType;
    ElectricSwitch electricSwitch;

    public String getBulbColor() {
        return bulbColor;
    }

    public void setBulbColor(String bulbColor) {
        this.bulbColor = bulbColor;
    }

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String bulbType) {
        this.bulbType = bulbType;
    }



    //Method to find the state of switch
    public void isSwitchOn(ElectricSwitch electricSwitch)
    {
        boolean switchOn = electricSwitch.isSwitchOn();
        if (!switchOn)
        {
            System.out.println("The bulb is off");
            switchOnBulb();
            System.out.println("The bulb is on");
        }
        else
            {
            System.out.println("The bulb is already on");
        }
    }



    //Method to change state of bulb
    public void switchOnBulb()
    {
        System.out.println("Bulb is turned on if it was off and off if it was on");
        System.out.println("The bulb color is: "+bulbColor);
    }


}

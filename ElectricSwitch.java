package src;


/*
   Desigin of a scenario of an electric switch that turns a light bubl on or off
   Model the requirement with a skeleton code
*/


public class ElectricSwitch
{

    private String switchId;            //which component switch operates on
    private boolean switchOn;           //find if switch is turned on or off

    public String getSwitchId()
    {
        return switchId;
    }

    public void setSwitchId(String switchId)
    {
        this.switchId = switchId;
    }

    public boolean isSwitchOn()
    {
        return switchOn;
    }

    public void setSwitchOn(boolean switchOn)
    {
        this.switchOn = switchOn;
    }

    public ElectricSwitch(String id, boolean state)
    {
        super();
        this.switchId = id;
        this.switchOn = state;

    }
    public ElectricSwitch()
    {
        switchOn = false;
        switchId = "bulb";
    }
    @Override
    public String toString()
    {
        return "The bulb in in state: "+switchOn;
    }

}

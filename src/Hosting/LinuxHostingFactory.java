package Hosting;

import Basic.*;
import Premium.*;
import PremiumPlus.*;

public class LinuxHostingFactory extends HostingFactory{

    public Basic getBasic()
    {
        return new LinuxBasic("Linux Basic Host");
    }

    public Premium getPremium()
    {
        return new LinuxPremium("Linux Premium Host");
    }

    public PremiumPlus getPremiumPlus()
    {
        return new LinuxPremiumPlus("Linux Premium + Host");
    }


}

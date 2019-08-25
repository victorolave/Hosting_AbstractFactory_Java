package Hosting;

import Basic.*;
import Premium.*;
import PremiumPlus.*;

public class WindowsHostingFactory extends HostingFactory{

    public Basic getBasic()
    {
        return new WindowsBasic("Windows Basic Host");
    }

    public Premium getPremium()
    {
        return new WindowsPremium("Windows Premium Host");
    }

    public PremiumPlus getPremiumPlus()
    {
        return new WindowsPremiumPlus("Windows Premium+ Host");
    }
}

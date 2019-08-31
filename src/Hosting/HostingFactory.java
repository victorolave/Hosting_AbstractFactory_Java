package Hosting;

import Basic.*;
import Premium.*;
import PremiumPlus.*;

public abstract class HostingFactory {

    public static final String LINUX_HOSTING = "Linux";
    public static final String WINDOWS_HOSTING = "Windows";

    public abstract Basic getBasic();
    public abstract Premium getPremium();
    public abstract PremiumPlus getPremiumPlus();

    public static HostingFactory getHostingFactory(String type)
    {
        if(type.equalsIgnoreCase(HostingFactory.LINUX_HOSTING))
            return new LinuxHostingFactory();

        if(type.equalsIgnoreCase(HostingFactory.WINDOWS_HOSTING))
            return new WindowsHostingFactory();

        return null;
    }

}


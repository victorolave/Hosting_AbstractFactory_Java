package Hosting;

import Basic.*;
import Premium.*;
import PremiumPlus.*;

public abstract class HostingFactory {

    public static final String LINUX_HOSTING = "LinuxHosting";
    public static final String WINDOWS_HOSTING = "WindowsHosting";

    public abstract Basic getBasic();
    public abstract Premium getPremium();
    public abstract PremiumPlus getPremiumPlus();

    public static HostingFactory getHostingFactory(String type)
    {
        if(type.equals(HostingFactory.LINUX_HOSTING))
            return new LinuxHostingFactory();

        if(type.equals(HostingFactory.WINDOWS_HOSTING))
            return new WindowsHostingFactory();

        return new LinuxHostingFactory();
    }

}

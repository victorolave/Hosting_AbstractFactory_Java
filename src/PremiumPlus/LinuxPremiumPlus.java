package PremiumPlus;

public class LinuxPremiumPlus implements PremiumPlus {

    private String name;

    public LinuxPremiumPlus(String pName){ name = pName; }

    public String getPremiumPlusName() {
        return name;
    }

    public String getPremiumPlusFeatures()
    {
        return "Linux Premium+ Features";
    }
}

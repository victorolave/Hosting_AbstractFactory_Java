package Premium;

public class LinuxPremium implements Premium{

    private String name;

    public LinuxPremium(String pName){ name = pName; }

    public String getPremiumName() {
        return name;
    }

    public String getPremiumFeatures()
    {
        return "Linux Premium Features";
    }
}

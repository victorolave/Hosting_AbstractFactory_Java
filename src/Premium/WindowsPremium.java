package Premium;

public class WindowsPremium implements Premium{
    private String name;

    public WindowsPremium(String pName){ name = pName; }

    public String getPremiumName() {
        return name;
    }

    public String getPremiumFeatures()
    {
        return "Windows Premium Features";
    }
}

package PremiumPlus;

public class WindowsPremiumPlus implements PremiumPlus{
    private String name;

    public WindowsPremiumPlus(String pName){ name = pName; }

    public String getPremiumPlusName() {
        return name;
    }

    public String getPremiumPlusFeatures()
    {
        return "Windows Premium Features";
    }
}

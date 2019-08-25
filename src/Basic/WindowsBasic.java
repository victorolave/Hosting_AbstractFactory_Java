package Basic;

public class WindowsBasic implements Basic{

    private String name;

    public WindowsBasic(String bName){ name = bName; }

    public String getBasicName() {
        return name;
    }

    public String getBasicFeatures()
    {
        return "Windows Basic Features";
    }

}

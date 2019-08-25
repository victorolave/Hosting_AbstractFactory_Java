package Basic;

public class LinuxBasic implements Basic {

    private String name;

    public LinuxBasic(String bName){ name = bName; }

    public String getBasicName() {
        return name;
    }

    public String getBasicFeatures()
    {
        return "Linux Basic Features";
    }
}

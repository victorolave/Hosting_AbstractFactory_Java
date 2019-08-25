import Basic.Basic;
import Hosting.*;
import Premium.Premium;
import PremiumPlus.PremiumPlus;

public class ClientMain {

    public static void main(String[] args) {

        String hostSO = "Windows";
        String hostType = "Basic";
        String response = "";

        HostingFactory hf = HostingFactory.getHostingFactory(hostSO);

        if(hostType.equals("Basic"))
        {
            Basic b = hf.getBasic();
            response = "Name: " + b.getBasicName() + " Features: " + b.getBasicFeatures();
        }

        if(hostType.equals("Premium"))
        {
            Premium p = hf.getPremium();
            response = "Name: " + p.getPremiumName() + " Features: " + p.getPremiumFeatures();
        }

        if(hostType.equals("Premium+"))
        {
            PremiumPlus pp = hf.getPremiumPlus();
            response = "Name: " + pp.getPremiumPlusName() + " Features: " + pp.getPremiumPlusFeatures();
        }

        System.out.println(response);

    }
}

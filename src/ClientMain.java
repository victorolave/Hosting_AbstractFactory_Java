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

        try {

            if(hostType.equalsIgnoreCase("Basic"))
            {
                Basic b = hf.getBasic();
                response = "Name: " + b.getBasicName() + " Features: " + b.getBasicFeatures();
            }

            if(hostType.equalsIgnoreCase("Premium"))
            {
                Premium p = hf.getPremium();
                response = "Name: " + p.getPremiumName() + " Features: " + p.getPremiumFeatures();
            }

            if(hostType.equalsIgnoreCase("Premium+"))
            {
                PremiumPlus pp = hf.getPremiumPlus();
                response = "Name: " + pp.getPremiumPlusName() + " Features: " + pp.getPremiumPlusFeatures();
            }

            System.out.println(response);

        }catch (NullPointerException e)
        {
            System.out.println("Tipo no encontrado...");
        }
    }
}

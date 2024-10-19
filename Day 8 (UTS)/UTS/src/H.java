Import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException


public class H{
    public static void main(String[] args) {
        City kota = new City();
        ServicePackage servicePackage = new ServicePackage();
        Status status = new Status();


      

        kota.City("Bandung","Jakarta");
        System.err.println("Origin: "+kota.getOrigin()+"\nDestination : "+kota.getDestination());
        servicePackage.servicePackage("Reguler [REG]", 15000);
        System.err.println("Service: "+servicePackage.getService()+"\n Value: "+servicePackage.getValue());
        status.Status(0, "OK");
        System.out.println("Code : "  + status.getCode() + "\nMessage: " + status.getDescription());
        status.Status(0, "OK");
        Pengiriman pengiriman = new Pengiriman(2, 1, 800000, "Celana Jeans");
        System.out.println("Berat  : "  + pengiriman.getWight() + "\nkuantiti: " + pengiriman.getQuantity() + "\nharga : "  + pengiriman.getPriceitem() + "\nNama: \n" + pengiriman.getProductName());
        kota.toString();
        System.err.println("     ");


        kota.City("Bandung","Surabaya");
        System.err.println("Origin: "+kota.getOrigin()+"\nDestination : "+kota.getDestination());
        servicePackage.servicePackage("Reguler [REG]", 26000);
        System.err.println("Service: "+servicePackage.getService()+"\n Value: "+servicePackage.getValue());
        status.Status(0, "OK");
        System.out.println("Code : "  + status.getCode() + "\nMessage: " + status.getDescription());
        status.Status(0, "OK");
        Pengiriman ngirim = new Pengiriman(2, 2, 900000, "Kemeja Lengan panjang");
        System.out.println("Berat  : "  + ngirim.getWight() + "\nkuantiti: " + ngirim.getQuantity() + "\nharga : "  + ngirim.getPriceitem() + "\nNama: " + ngirim.getProductName());
        kota.toString();

        System.err.println();
    }
}

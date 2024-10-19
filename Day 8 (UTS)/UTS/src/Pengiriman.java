
import javax.print.DocFlavor;

public class Pengiriman
{
      /*
     * Code ini merupaka codekelas yang memiliki hubungan regeresiasi dengan kelas pengiriman,servicepackge,status
     * 
     * Kode ini bisa bekerja sendiri tampa kelas lain 
     * code ini bisa diturunakan atau bisa menjadi super class atau Subclass
     * 
     * 
     * 
     */
    private int wight;
    private int quantity;
    private int priceitem;
    private String productName;
  

    public Pengiriman(int wight, int quantity, int priceitem, String productName) {
      this.wight = wight;
      this.quantity = quantity;
      this.priceitem = priceitem;
      this.productName = productName;
    }//  Contruktor untuk  menginisiasi atribut pengiriman

    public int getWight() {
      return wight;
    }// Sebagai menampilkan  atribut wight

    public void setWight(int wight) {
      this.wight = wight;
    }// Sebagai mengubah  atribut wight
    public int getQuantity() {
      return quantity;
    }// Sebagai menampilkan  atribut wight
    public void setQuantity(int quantity) {
      this.quantity = quantity;
    }// Sebagai mengubah  atribut wight
    public int getPriceitem() {
      return priceitem;
    }// Sebagai menampilkan  atribut Kuantiti
    public void setPriceitem(int priceitem) {
      this.priceitem = priceitem;
    }// Sebagai mengubah  atribut wight
    public String getProductName() {
      return productName;
    }// Sebagai menampilkan  atribut nama
    public void setProductName(String productName) {
      this.productName = productName;
    }

    

}

// public class
//         {
//           "status": {
//             "code": 0,
//             "description": "OK"
//           },
//           "servicePackage": {
//             "service": "Reguler (REG)",
//             "value": 26000
//           },
//           "city": {
//             "origin": "BANDUNG",
//             "destination": "SURABAYA"
//           },
//           "weight": 2,
//           "quantity": 2,
//           "priceItem": 90000,
//           "productName": "Kemeja Lengan Panjang"
//       }
       

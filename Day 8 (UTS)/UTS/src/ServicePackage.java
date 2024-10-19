class ServicePackage {
  private String service;
  private int  value;
        /*
     * Code ini merupaka codekelas yang memiliki hubungan regeresiasi dengan kelas pengiriman,servicepackge,status
     * 
     * Kode ini bisa bekerja sendiri tampa kelas lain 
     * code ini bisa diturunakan atau bisa menjadi super class atau Subclass
     * 
     * 
     * 
     */

          public void servicePackage(String service, int value) {
            this.service = service;
            this.value = value;
          }// Sebagai Contruktor
          public String getService() {
            return service;
          }// Sebagai menmapilakn atribut wight
          public void setService(String service) {
            this.service = service;
          }// Sebagai mengubah   atribut wight
          public int getValue() {
            return value;
          }// Sebagai menmpilkan   atribut value
          public void setValue(int value) {
            this.value = value;
          }// Sebagai mengubah   atribut Value
}

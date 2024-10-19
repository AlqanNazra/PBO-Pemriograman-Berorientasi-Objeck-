public class City {
    /*
     * Code ini merupaka codekelas yang memiliki hubungan regeresiasi dengan kelas pengiriman,servicepackge,status
     * 
     * Kode ini bisa bekerja sendiri tampa kelas lain 
     * code ini bisa diturunakan atau bisa menjadi super class atau Subclass
     * 
     * 
     * 
     */
    private String origin;
    private String destination;
              public void City(String origin,String destination) {
                this.origin = origin;
                this.destination = destination;
              } // Contruktor kelas city
              public String getOrigin() {
                return origin;
              } // Mengouptu Origin
              public void setOrigin(String origin) {
                this.origin = origin;
              } // Mengubah value origin
              public String getDestination() {
                return destination;
              } // Mengouptu Destination
              public void setDestination(String destination) {
                this.destination = destination;
              } // Mengubah value Destination 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("City{");
        sb.append("origin=").append(origin);
        sb.append(", destination=").append(destination);
        sb.append('}');
        return sb.toString();
    }
    
}

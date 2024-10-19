public class Status {
    private int code;
    private String description;
        /*
     * Code ini merupaka codekelas yang memiliki hubungan regeresiasi dengan kelas pengiriman,servicepackge,status
     * 
     * Kode ini bisa bekerja sendiri tampa kelas lain 
     * code ini bisa diturunakan atau bisa menjadi super class atau Subclass
     * 
     * 
     * 
     */
    public void Status(int code, String description) {
        this.code = code;
        this.description = description;
      }
      public void setCode(int code) {
        this.code = code;
      }
      public void setDescription(String description) {
        this.description = description;
      }
      public int getCode() {
        return code;
      }
      public String getDescription() {
        return description;
      }
}

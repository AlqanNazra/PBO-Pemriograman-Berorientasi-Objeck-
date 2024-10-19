abstract public class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String ename, String eaddress, String ephone) {
        name = ename;
        address = eaddress;
        phone = ephone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaffMember{");
        sb.append("name=").append(name);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append('}');
        return sb.toString();
    }

    public abstract double pay();

    
}

public class Commision extends Hourly
{    
    private int commisiorate;
    private double totalsales; 
    private int hoursWorked;
    public Commision(int commisiorate, String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commisiorate = commisiorate;
    }


    public double Total ()
    {
        return super.pay() + komisirate();
    }

    public double  komisirate ()
    {
        return totalsales * 0.20;
    }

    public void addsales(int totalsales)
    {
        this.totalsales = totalsales;
    }

    @Override
    public double pay()
    {
       double payment = super.pay() * Total();
       totalsales = 0;
 
       return payment;
    }


    @Override
    public String toString() {
        return "Commision [name=" + name + ", commisiorate=" + commisiorate + ", socialSecurityNumber="
                + socialSecurityNumber + ", address=" + address + ", totalsales=" + totalsales + ", payRate=" + payRate
                + ", phone=" + phone + ", hoursWorked=" + hoursWorked + ", Total()=" + Total() + ", komisirate()="
                + komisirate() + ", pay()=" + pay() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + "]";
    }

    
}

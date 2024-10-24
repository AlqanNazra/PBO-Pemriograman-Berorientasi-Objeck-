// File: Commission.java

public class Commission extends Hourly {
    private double totalSales; 
    private double commissionRate; 

    // Konstruktor
    public Commission(String name, String address, String phone, String socSecNumber, double payRate, double commissionRate) {
        super(name, address, phone, socSecNumber, payRate); 
        this.commissionRate = commissionRate;
        this.totalSales = 0.0; 
    }


    public void addSales(double totalSales) {
        this.totalSales += totalSales; 
    }

  
    @Override
    public double pay() {
        double payment = super.pay(); 
        payment += totalSales * commissionRate; 
        totalSales = 0; 
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}

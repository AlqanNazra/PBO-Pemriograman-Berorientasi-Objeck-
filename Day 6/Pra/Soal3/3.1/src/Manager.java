import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {  
    public Manager(String n, double s, int d, int m, int y, String secretary){  
        super(n, s, d, m, y); 
        secretaryName = secretary; // Initialize secretaryName with the provided argument
    } 
    
    public void raiseSalary(double byPercent){  
        // Add 1/2% bonus for every year of service 
        GregorianCalendar todaysDate = new GregorianCalendar(); 
        int currentYear = todaysDate.get(Calendar.YEAR); 
        double bonus = 0.5 * (currentYear - hireYear()); 
        super.raiseSalary(byPercent + bonus); 
    } 
    
    public String getSecretaryName(){  
        return secretaryName; 
    } 
    
    private String secretaryName; 
}

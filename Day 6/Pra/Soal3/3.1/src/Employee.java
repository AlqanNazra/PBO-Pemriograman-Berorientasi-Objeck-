public class Employee implements Sortable {
    private String name;
    private double salary;
    private int hireDay;
    private int hireMonth;
    private int hireYear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireDay = day;
        hireMonth = month;
        hireYear = year;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void print(){  
        System.out.println(name + " " + salary + " " + hireYear()); 
     } 
      
     public void raiseSalary(double byPercent){  
        salary *= 1 + byPercent / 100; 
     } 
      
     public int hireYear(){  
      return hireYear; 
     }
}
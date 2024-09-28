
public class ManagerTest {  
    public static void main (String[] args){  
        Employee[] staff = new Employee[3]; 
        staff[0] = new Employee("Antonio Rossi", 6000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 1500000, 1, 12, 1991, "Alice Smith"); // Pass a name for the secretary
        staff[2] = new Employee("Isabel Vidal", 9000000, 1, 11, 1993); 
        
        Sortable.shell_sort(staff);
        int i;
        for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
        for (i = 0; i < 3; i++) staff[i].print();
    } 
}

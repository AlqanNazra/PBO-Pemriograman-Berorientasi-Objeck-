public class Salesperson implements Perbandingan {
    private String firstName, lastName;
    private int totalSales;

    // Constructor
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }

    // toString method
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // equals method
    public boolean equals(Object other) {
        if (other instanceof Salesperson) {
            Salesperson otherSalesperson = (Salesperson) other;
            return lastName.equals(otherSalesperson.getLastname()) &&
                   firstName.equals(otherSalesperson.getFirstName());
        }
        return false;
    }

    // compareTo method
    @Override
    public int compareTo(Salesperson other) {
        if (this.totalSales != other.totalSales) {
            return Integer.compare(this.totalSales, other.totalSales);
        }
        return this.lastName.compareTo(other.lastName);  // Untuk memecahkan seri berdasarkan nama belakang
    }

    // Accessor methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public int getSales() {
        return totalSales;
    }
}

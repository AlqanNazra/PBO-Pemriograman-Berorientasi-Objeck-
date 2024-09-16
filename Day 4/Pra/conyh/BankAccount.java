// Kelas dengan enkapsulasi
public class BankAccount {
    // Atribut private, hanya bisa diakses melalui metode di kelas ini
    private String accountNumber;
    private double balance;

    // Konstruktor untuk inisialisasi objek
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Metode public untuk mendapatkan nomor rekening
    public String getAccountNumber() {
        return accountNumber;
    }

    // Metode public untuk mendapatkan saldo
    public double getBalance() {
        return balance;
    }

    // Metode public untuk menyetor uang
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Metode public untuk menarik uang
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// Kelas utama untuk menguji enkapsulasi
public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount myAccount = new BankAccount("123456789", 500.00);

        // Mengakses data melalui metode publik
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: " + myAccount.getBalance());

        // Menyetor uang
        myAccount.deposit(150.00);
        System.out.println("Balance after deposit: " + myAccount.getBalance());

        // Menarik uang
        if (myAccount.withdraw(100.00)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        System.out.println("Balance after withdrawal: " + myAccount.getBalance());
    }
}

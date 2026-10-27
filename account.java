public class account {
    private String owner;
    private double balance;

    public account(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Insättning genomförd.");
        } else {
            System.out.println("Beloppet måste vara större än 0.");
        }

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0.");
        } else if (amount > balance) {
            System.out.println("Uttag nekades. Otillräckligt saldo.");
        } else {
            balance -= amount;
            System.out.println("Uttag genomfört.");
        }
    }


}
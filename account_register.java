import java.util.ArrayList;

public class account_register {

    private ArrayList<account> accounts;

    public account_register() {
        accounts = new ArrayList<>();
    }

    public void createAccount(String owner, double startBalance) {
        account account = new account(owner, startBalance);
        accounts.add(account);
        System.out.println("Konto skapat.");
    }

    public void listAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("Inga konton registrerade.");
            return;
        }

        for (account account : accounts) {
            System.out.println(
                    "Ägare: " + account.getOwner() +
                            ", Saldo: " + account.getBalance()
            );
        }
    }

    public account findAccount(String owner) {
        for (account account : accounts) {
            if (account.getOwner().equalsIgnoreCase(owner)) {
                return account;
            }
        }

        return null;
    }
}
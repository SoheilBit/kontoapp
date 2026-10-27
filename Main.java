import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        account_register register = new account_register();

        boolean running = true;

        while (running) {

            System.out.println("\n===== KONTOAPPEN =====");
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.print("Välj: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":
                    System.out.print("Ange ägare: ");
                    String owner = scanner.nextLine();


                    System.out.print("Ange startsaldo: ");
                    double balance = Double.parseDouble(scanner.nextLine());

                    register.createAccount(owner, balance);

                    break;

                case "2":
                    register.listAccounts();
                    break;

                case "3":
                    System.out.print("Ange ägare: ");
                    owner = scanner.nextLine();

                    account depositAccount = register.findAccount(owner);

                    if (depositAccount == null) {
                        System.out.println("Kontot hittades inte.");
                        break;
                    }

                    System.out.print("Belopp att sätta in: ");

                    double amount = Double.parseDouble(scanner.nextLine());
                    depositAccount.deposit(amount);

                    break;

                case "4":
                    System.out.print("Ange ägare: ");
                    owner = scanner.nextLine();
                    account withdrawAccount = register.findAccount(owner);

                    if (withdrawAccount == null) {
                        System.out.println("Kontot hittades inte.");
                        break;
                    }


                    System.out.print("Belopp att ta ut: ");
                    amount = Double.parseDouble(scanner.nextLine());
                    withdrawAccount.withdraw(amount);

                    break;

                case "5":
                    running = false;
                    System.out.println("Programmet avslutas.");
                    break;

                default:
                    System.out.println("Ogiltigt val.");
            }
        }

        scanner.close();
    }
}
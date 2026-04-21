import java.util.*;

// ===== Интерфейс =====
interface BankOperations {
    void deposit(double amount);
    void withdraw(double amount);
    void showInfo();
}

// ===== Абстракт класс =====
abstract class Account implements BankOperations {
    protected String ownerName;
    protected double balance;
    protected List<String> history = new ArrayList<>();

    public Account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        history.add("Салынды: +" + amount);
    }

    public abstract void withdraw(double amount);

    @Override
    public void showInfo() {
        System.out.println("\n👤 Аты: " + ownerName);
        System.out.println("💰 Баланс: " + balance);

        System.out.println("📜 Тарих:");
        for (String h : history) {
            System.out.println(" - " + h);
        }
    }
}

// ===== Savings Account =====
class SavingsAccount extends Account {
    private double interest = 0.05;

    public SavingsAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        double bonus = amount * interest;
        balance += amount + bonus;
        history.add("Пайызбен салынды: +" + (amount + bonus));
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("❌ Ақша жетпейді!");
            return;
        }
        balance -= amount;
        history.add("Алынды: -" + amount);
    }
}

// ===== Credit Account =====
class CreditAccount extends Account {
    private double limit = 1000;

    public CreditAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + limit < amount) {
            System.out.println("❌ Лимиттен асты!");
            return;
        }
        balance -= amount;
        history.add("Кредитпен алынды: -" + amount);
    }
}

// ===== Банк жүйесі =====
class BankSystem {
    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(Account acc) {
        accounts.put(acc.ownerName.toLowerCase(), acc);
    }

    public Account getAccount(String name) {
        return accounts.get(name.toLowerCase());
    }
}

// ===== MAIN =====
public class Main {

    // 🔒 Қауіпсіз INT енгізу
    public static int safeIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("❌ Сан енгіз! Қайтадан: ");
            sc.next();
        }
        return sc.nextInt();
    }

    // 🔒 Қауіпсіз DOUBLE енгізу
    public static double safeDoubleInput(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.print("❌ Сан енгіз! Қайтадан: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankSystem bank = new BankSystem();

        while (true) {
            System.out.println("\n===== БАНК ЖҮЙЕСІ =====");
            System.out.println("1. Шот ашу");
            System.out.println("2. Ақша салу");
            System.out.println("3. Ақша алу");
            System.out.println("4. Ақпарат көру");
            System.out.println("0. Шығу");
            System.out.print("Таңдау: ");

            int choice = safeIntInput(sc);
            sc.nextLine(); // buffer тазалау

            if (choice == 0) {
                System.out.println("👋 Сау бол!");
                break;
            }

            switch (choice) {

                case 1:
                    System.out.print("Атыңыз: ");
                    String name = sc.nextLine();

                    System.out.print("Бастапқы баланс: ");
                    double bal = safeDoubleInput(sc);

                    System.out.println("1 - Savings, 2 - Credit");
                    System.out.print("Таңдау: ");
                    int type = safeIntInput(sc);
                    sc.nextLine();

                    Account acc;
                    if (type == 1) {
                        acc = new SavingsAccount(name, bal);
                    } else {
                        acc = new CreditAccount(name, bal);
                    }

                    bank.addAccount(acc);
                    System.out.println("✅ Шот ашылды!");
                    break;

                case 2:
                    System.out.print("Аты: ");
                    name = sc.nextLine();
                    Account accDep = bank.getAccount(name);

                    if (accDep != null) {
                        System.out.print("Сома: ");
                        double amount = safeDoubleInput(sc);
                        accDep.deposit(amount);
                    } else {
                        System.out.println("❌ Табылмады!");
                    }
                    break;

                case 3:
                    System.out.print("Аты: ");
                    name = sc.nextLine();
                    Account accW = bank.getAccount(name);

                    if (accW != null) {
                        System.out.print("Сома: ");
                        double amount = safeDoubleInput(sc);
                        accW.withdraw(amount);
                    } else {
                        System.out.println("❌ Табылмады!");
                    }
                    break;

                case 4:
                    System.out.print("Аты: ");
                    name = sc.nextLine();
                    Account accInfo = bank.getAccount(name);

                    if (accInfo != null) {
                        accInfo.showInfo();
                    } else {
                        System.out.println("❌ Табылмады!");
                    }
                    break;

                default:
                    System.out.println("❌ Қате таңдау!");
            }
        }
    }
}
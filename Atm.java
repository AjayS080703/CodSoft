package CodSoft;

import java.util.*;

class Account {
    private double bal;

    public Account(double bal) {
        this.bal = bal;
    }

    public String dep(double amt) {
        if (amt > 0) {
            bal += amt;
            return "DEPOSITED: $" + amt + ". BALANCE: $" + bal;
        } else {
            return "INVALID DEPOSIT.";
        }
    }

    public String wd(double amt) {
        if (amt > bal) {
            return "INSUFFICIENT FUNDS.";
        } else if (amt > 0) {
            bal -= amt;
            return "WITHDREW: $" + amt + ". BALANCE: $" + bal;
        } else {
            return "INVALID WITHDRAWAL.";
        }
    }

    public String bal() {
        return "BALANCE: $" + bal;
    }
}

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("INITIAL BALANCE: ");
        Account acc = new Account(sc.nextDouble());

        boolean run = true;
        while (run) {
            System.out.println("\n1. WiD\n2. DEP\n3. BAL\n4. EXIT");
            System.out.print("OPTION: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.print("WD AMT: ");
                    System.out.println(acc.wd(sc.nextDouble()));
                    break;
                case 2:
                    System.out.print("DEP AMT: ");
                    System.out.println(acc.dep(sc.nextDouble()));
                    break;
                case 3:
                    System.out.println(acc.bal());
                    break;
                case 4:
                    System.out.println("EXITING ATM. THANK YOU!");
                    run = false;
                    break;
                default:
                    System.out.println("INVALID OPTION.");
            }
        }

        sc.close();
    }
}

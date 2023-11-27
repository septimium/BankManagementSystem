package bms;

import java.util.*;
public class Menu {

    public Menu(Scanner scan, Account acc, Database database, ArrayList<Account> accounts){
        int index = 0;
        do {
            System.out.println("\nWelcome, " + acc.getFirstName() + " " + acc.getLastName() + "!");
            System.out.println("1. Deposit money.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Check balance.");
            System.out.println("4. Exit.");
            index = scan.nextInt();
            switch (index) {
                case 1:
                    new Deposit(scan, acc);
                    break;
                case 2:
                    new Withdraw(scan, acc);
                    break;
                case 3:
                    System.out.println("Your balance is: "+acc.getBalance());
                    break;
                case 4:
                    database.saveAccounts(accounts);
                    break;
            }
        } while (index != 4);
    }
}

package bms;

import javax.xml.crypto.Data;
import java.util.*;
public class Login {

    public Login(Scanner scan, ArrayList<Account> accounts, Database database) {
        System.out.println("Enter account id:");
        int id = scan.nextInt();
        System.out.println("Enter passcode:");
        String passcode = scan.next();
        Account account = new Account();
        boolean exist = false;
        for (Account acc : accounts) {
            if (acc.getId() == id && acc.getPasscode().equals(passcode)) {
                exist = true;
                account = acc;
            }
        }
        if (exist) {
            new Menu(scan, account, database, accounts);
        } else {
            System.out.println("Account doesn't exist or passcode is wrong.");
        }
    }
}

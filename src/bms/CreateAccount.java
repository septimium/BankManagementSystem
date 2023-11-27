package bms;

import java.util.*;
public class CreateAccount {

    public CreateAccount(Scanner scan, int accid, ArrayList<Account> accounts, Database database){
        System.out.println("Enter first name:");
        String firstName = scan.next();
        System.out.println("Enter last name: ");
        String lastName = scan.next();
        System.out.println("Enter balance:");
        double balance = scan.nextDouble();
        System.out.println("Choose a passcode: ");
        String passcode = scan.next();
        System.out.println("Confirm passcode: ");
        String passcode2 = scan.next();
        if(!passcode.equals(passcode2)){
            System.out.println("Passwords not matching, please try again.\n");
            return;
        }
        int id = 1000000 + accid;
        accid++;
        Account acc = new Account(firstName, lastName, id, balance, passcode);
        accounts.add(acc);
        System.out.println("Your account id is: "+id+"\nDon't forget it!");
        new Menu(scan, acc, database, accounts);
    }
}

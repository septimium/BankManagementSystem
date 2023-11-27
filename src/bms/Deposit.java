package bms;

import java.util.*;

public class Deposit {

    public Deposit(Scanner scan, Account acc){
        System.out.println("Enter amount: ");
        double amount = scan.nextDouble();
        acc.setBalance(acc.getBalance()+amount);
        System.out.println(amount+" have been deposited successfully!");
    }
}

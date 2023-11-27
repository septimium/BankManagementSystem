package bms;

import java.util.*;

public class Withdraw {

    public Withdraw(Scanner scan, Account acc){
        System.out.println("Enter amount: ");
        double amount = scan.nextDouble();
        if(acc.getBalance() >= amount) {
            acc.setBalance(acc.getBalance() - amount);
            System.out.println(amount + " have been deposited successfully!");
        }
        else
            System.out.println("You do not have enough money for this withdraw!");
    }
}

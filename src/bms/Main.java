package bms;

import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int accid = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {

        accounts = new ArrayList<>();
        Database database = new Database();
        accounts = database.getAccounts();
        accid = accounts.size();
        System.out.println("Welcome to septimium's BMS!");
        System.out.println("1. Create a new account.");
        System.out.println("2. Already have an account? Login.");
        System.out.println("3. Exit the app.");
        int index = scan.nextInt();
        switch(index){
            case 1:
                new CreateAccount(scan, accid, accounts, database);
                break;
            case 2:
                new Login(scan, accounts, database);
                break;
        }
    }

}
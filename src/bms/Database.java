package bms;

import java.util.*;
import java.io.*;

public class Database {
    File file;
    public Database(){
        file = new File("files/data");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList<Account> getAccounts() {
        String text = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            while ((s = br.readLine()) != null ){
                text = text + s;
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Account> accounts = new ArrayList<>();
        String[] array = text.split(" --> NEW ACCOUNT");
        for(String v: array){
            if(!v.equals("")){
                String[] array2 = v.split(" -- ");
                Account a = new Account();
                a.setFirstName(array2[0]);
                a.setLastName(array2[1]);
                a.setId(Integer.parseInt(array2[2]));
                a.setBalance(Double.parseDouble(array2[3]));
                a.setPasscode(array2[4]);
                accounts.add(a);
            }
        }
        return accounts;
    }

    public void saveAccounts(ArrayList<Account> accounts) {
        String text = "";
        for(Account a: accounts){
            StringBuilder bd = new StringBuilder();
            bd.append(a.getFirstName()).append(" -- ");
            bd.append(a.getLastName()).append(" -- ");
            bd.append(String.valueOf(a.getId())).append(" -- ");
            bd.append(String.valueOf(a.getBalance())).append(" -- ");
            bd.append(a.getPasscode());
            bd.append(" --> NEW ACCOUNT\n");
            text = text + bd.toString();
        }
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.print(text);
            pw.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

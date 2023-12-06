package bms;

import javax.swing.*;
import java.awt.*;
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

        new Login(accounts, database, accid);

    }

    public static JFrame Frame(int width, int height) {
        JFrame frame = new JFrame("Bank Management System");
        frame.setSize(width, height);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.white);
        return frame;
    }

    public static JLabel Label(String text, int size){
        JLabel label = new JLabel(text);
        label.setFont(new Font("Tahoma", Font.BOLD, size));
        label.setForeground(Color.BLACK);
        label.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        return label;
    }

    public static JTextField TextField(int size){
        JTextField textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, size));
        textField.setForeground(Color.BLACK);
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        return textField;
    }

    public static JPasswordField PasswordField(int size){
        JPasswordField passField = new JPasswordField();
        passField.setFont(new Font("Tahoma", Font.BOLD, size));
        passField.setForeground(Color.BLACK);
        passField.setHorizontalAlignment(SwingConstants.CENTER);
        return passField;
    }

    public static JButton Button(String text, int size){
        JButton btn = new JButton(text);
        btn.setFont(new Font("Tahoma", Font.BOLD, size));
        btn.setForeground(Color.white);
        btn.setBackground(Color.black);
        btn.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        btn.setHorizontalAlignment(SwingConstants.CENTER);
        return btn;
    }

}
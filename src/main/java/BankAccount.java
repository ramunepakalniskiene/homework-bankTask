import javax.swing.*;
import java.util.UUID;

public class BankAccount extends User {
    private double balance;
    private double transaction;


    public BankAccount(UUID id, String name, int age, String gender, String email, String accountNumber, double balance) {
        super(id, name, age, gender, email, accountNumber);
        this.balance = balance;

    }

    public BankAccount() {

    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTransaction() {
        return transaction;
    }

    public void setTransaction(double transaction) {
        this.transaction = transaction;
    }


    public void bankAccountTransactions() {
        String[] options = {"DEPOSIT", "WITHDRAW", "SHOW CURRENT BALANCE", "EXIT BANK APPLICATION"};
        int firstOptionSelected = JOptionPane.showOptionDialog(null, "Select the option:", "Select:", 0, JOptionPane.PLAIN_MESSAGE, null, options, 0);
        switch (firstOptionSelected) {
            case 0:
                this.debitUserBalance();
                break;
            case 1:
                this.creditUserBalance();
                break;
            case 2:
                JOptionPane.showMessageDialog(null, balance, "Your current balance is:", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Thanks for visiting us! Goodbye!");
                System.exit(0);
                System.out.println("Thanks for using our bank, looking forward to see you in the future");
                break;
        }
        int secondOptionSelected = JOptionPane.showConfirmDialog(null, "Do you want to continue?:", "Select the option:", JOptionPane.YES_NO_OPTION);
        if (secondOptionSelected == 0) {
            this.bankAccountTransactions();
        } else {
            JOptionPane.showMessageDialog(null, "Thanks for choosing us!", null, JOptionPane.INFORMATION_MESSAGE);
        }

    }


    public double debitUserBalance() {
        double currentBalance = 0;
        setBalance(Double.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to deposit", "Message: ", JOptionPane.PLAIN_MESSAGE)));
        balance += currentBalance;
        transaction = currentBalance;
        JOptionPane.showMessageDialog(null, balance, "Deposited amount:", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, balance, "Transaction was successful!", JOptionPane.INFORMATION_MESSAGE);

        System.out.println("Transaction was successful, your current balance is: " + balance);
        return balance;
    }

    public double creditUserBalance() {
        double creditedAmount = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount you want to withdraw", "Message: ", JOptionPane.PLAIN_MESSAGE));
        balance -= creditedAmount;
        transaction = -creditedAmount;
        if (balance < 0) {
            JOptionPane.showMessageDialog(null, "Transaction failed: please deposit your account", String.valueOf(balance), JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, balance, "Your current balance is: ", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Your current balance is " + balance + " please debit your account!");
        } else {
            JOptionPane.showMessageDialog(null, creditedAmount, "Credited amount:", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Transaction was successful, your current balance is: " + balance);
        }return balance;
    }


    private String showCurrentAmount() {
        return "You current balance is: " + getBalance();

    }

    @Override
    public String toString() {
        return "Your Bank Account balance currently is: " + balance;
    }
}

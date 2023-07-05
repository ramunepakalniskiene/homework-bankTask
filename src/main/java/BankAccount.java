import javax.swing.*;
import java.util.UUID;

public class BankAccount extends User{
    private Long balance;
    private Long transaction;


    public BankAccount(UUID id, String name, int age, String gender, String email, String accountNumber, Long balance, Long transaction) {
        super(id, name, age, gender, email, accountNumber);
        this.balance = balance;
        this.transaction=transaction;
    }

    public BankAccount() {

    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance =balance;
    }

    public Long getTransaction() {
        return transaction;
    }

    public void setTransaction(Long transaction) {
        this.transaction = transaction;
    }

    public User replaceUser(){
        return null;
        
    }
    public Long creditUserBalance() {
        Long currentAmount = getBalance();
        if (currentAmount != 0) {
            setBalance(Long.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to withdraw", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance-=currentAmount;
            transaction = currentAmount;

        }
        return currentAmount;
    }


        void bankAccountTransactions(int balance){


        }


    public Long debitUserBalance(){
            Long currentAmount=0L;
            setBalance(Long.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to deposit", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance+=currentAmount;
            transaction=currentAmount;
        return currentAmount;
        }

    @Override
    public String toString() {
        return "Bank{" +
                "balance=" + balance +
                '}';
    }
}

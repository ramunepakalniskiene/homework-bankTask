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

        void bankAccountTransactions(){
        String[]options={"WITHDRAW", "DEPOSIT", "SHOW CURRENT BALANCE"};
        int optionSelected=JOptionPane.showOptionDialog(null, "Select the option:","Select:", 0, JOptionPane.PLAIN_MESSAGE,null,options,0 );
        if (optionSelected==0){
            this.creditUserBalance();
            this.toString();
        }else if(optionSelected==1){
            this.debitUserBalance();
            this.toString();
        } else {
            this.toString();
        }

        }
//        int optionSelected=JOptionPane.showOptionDialog(null, "Do you want to continue?:","Select the option:", 0, JOptionPane.PLAIN_MESSAGE,null,options,0 );


    public Long debitUserBalance(){
            Long currentAmount=0L;
            setBalance(Long.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to deposit", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance+=currentAmount;
//            transaction=currentAmount;
        return currentAmount;
        }

    public Long creditUserBalance() {
        Long currentAmount = getBalance();
        if (currentAmount != 0) {
            setBalance(Long.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to withdraw", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance-=currentAmount;
//            transaction = currentAmount;

        }
        return currentAmount;
    }


    @Override
    public String toString() {
        return "Your Bank Account balance currently is: " + balance;
    }
}

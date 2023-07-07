import javax.swing.*;
import java.util.UUID;

public class BankAccount extends User{
    private double balance;



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
        this.balance =balance;
    }


    public User replaceUser(){
        return null;
        
    }

        void bankAccountTransactions(){
        String[]options={"DEPOSIT", "WITHDRAW", "SHOW CURRENT BALANCE"};
        int optionSelected=JOptionPane.showOptionDialog(null, "Select the option:","Select:", 0, JOptionPane.PLAIN_MESSAGE,null,options,0 );
        if (optionSelected==0){
            this.debitUserBalance();
            this.toString();
        }else if(optionSelected==1){
            if(balance==0){
                System.out.println("Current balance is 0,00 Eur, please deposit account");
            } else if (balance>0){
                this.creditUserBalance();
                this.toString();
            } else {
                this.toString();
            }
        }

        }
//        int optionSelected=JOptionPane.showOptionDialog(null, "Do you want to continue?:","Select the option:", 0, JOptionPane.PLAIN_MESSAGE,null,options,0 );


    public double debitUserBalance(){
            double currentAmount=0L;
            setBalance(Double.valueOf(JOptionPane.showInputDialog(null, "Enter the amount you want to deposit", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance+=currentAmount;
            JOptionPane.showMessageDialog(null, balance, "Deposited amount:", JOptionPane.INFORMATION_MESSAGE);
           return  currentAmount;
        }

    public double creditUserBalance() {
        double currentAmount = getBalance();
        if (currentAmount != 0) {
            setBalance(Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount you want to withdraw", "Message: ",JOptionPane.PLAIN_MESSAGE)));
            balance-=currentAmount;

        }
        return currentAmount;
    }


    @Override
    public String toString() {
        return "Your Bank Account balance currently is: " + balance;
    }
}

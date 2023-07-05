import javax.swing.JOptionPane;
import java.util.UUID;

public class UserInputDialogBox {
    public static void main(String[] args) {
        User userDetails = new User();
        userDetails.createUser(userDetails);

        BankAccount bankAccount = new BankAccount();
        bankAccount.debitUserBalance();
        bankAccount.creditUserBalance();
        System.out.println(bankAccount);




        }
    }




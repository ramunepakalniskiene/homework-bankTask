import javax.swing.JOptionPane;
import java.util.UUID;

public class UserInputDialogBox {
    public static void main(String[] args) {
        User userDetails = new User();
        userDetails.createUser(userDetails);

        BankAccount bankAccount = new BankAccount();
        bankAccount.bankAccountTransactions();
        System.out.println(bankAccount);




        }
    }




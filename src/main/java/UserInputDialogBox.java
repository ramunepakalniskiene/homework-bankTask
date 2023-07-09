import javax.swing.JOptionPane;
import java.util.UUID;

public class UserInputDialogBox {
    public static void main(String[] args) {
        User userDetails = new User();
        BankAccount bankAccount = new BankAccount();

        JOptionPane.showMessageDialog(null,"Welcome to The Best Bank!","WELCOME MESSAGE", JOptionPane.INFORMATION_MESSAGE );
        userDetails.createUser(userDetails);
        bankAccount.bankAccountTransactions();

        }
    }




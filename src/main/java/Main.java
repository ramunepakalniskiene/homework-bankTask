import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        User userDetails = new User();
        BankAccount bankAccount = new BankAccount();

        JOptionPane.showMessageDialog(null,"Welcome to The Best Bank!","WELCOME MESSAGE", JOptionPane.INFORMATION_MESSAGE );
//        userDetails.createUser(userDetails);
        bankAccount.bankAccountTransactions();

        }
    }




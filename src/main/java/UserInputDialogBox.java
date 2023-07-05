import javax.swing.JOptionPane;
import java.util.UUID;

public class UserInputDialogBox {
    public static void main(String[] args) {
        User userDetails = new User();
        userDetails.setName(JOptionPane.showInputDialog(null, "Please enter your name", "name"));
        userDetails.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age", "00")));
            if (userDetails.getAge() < 18) {
            JOptionPane.showMessageDialog(null, "Sorry, account can not be created in our bank due to age limitation!", "WARNING!", JOptionPane.WARNING_MESSAGE);
            } else{
          String[] responses = {"MAN", "WOMAN", "OTHER"};
          userDetails.setGender(String.valueOf(JOptionPane.showOptionDialog(
                    null,
                    "Please select your gender: ",
                    "Select correct option",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    responses,
                    0)));


            userDetails.setEmail(JOptionPane.showInputDialog(null, "Please enter your email", "example@example.com"));
            userDetails.setAccountNumber(String.valueOf(JOptionPane.showConfirmDialog(null, "Do you want to create bank a account?", "Final step:",JOptionPane.YES_NO_CANCEL_OPTION)));
            userDetails.setId(UUID.randomUUID());
            System.out.println(userDetails);


        }


    }
}



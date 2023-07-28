import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class UserController {



    private Map<User, BankAccount> userList = new HashMap<>();

    public UserController() {
    }

    public UserController( Map<User, BankAccount> userList) {
        this.userList = userList;
    }

    public void createUser(User user) {
        int firstStepAnswer = JOptionPane.showConfirmDialog(null, "Do you want proceed by creating bank account in our bank?", "Do you want to proceed?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (firstStepAnswer != 0) {
            JOptionPane.showMessageDialog(null, "Thanks for visiting our internet bank, looking forward to see you in the future!");
            System.exit(0);
        } else {
            user.setName(JOptionPane.showInputDialog(null, "Please enter your name", "name"));
            user.setUserName(JOptionPane.showInputDialog(null, "Please create your user name", "User name:"));
            user.setPassword(JOptionPane.showInputDialog(null, "Please create your password", "password"));
            user.setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age", "00")));
            if (user.getAge() < 18) {
                JOptionPane.showMessageDialog(null, "Sorry, account can not be created in our bank due to age limitation!Goodbye!", "WARNING!", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            } else {
                String[] responses = {"MAN", "WOMAN", "OTHER"};
                user.setGender(String.valueOf(JOptionPane.showOptionDialog(
                        null,
                        "Please select your gender: ",
                        "Select correct option",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        responses,
                        0)));

                user.setEmail(JOptionPane.showInputDialog(null, "Please enter your email", "example@example.com"));
                user.setAccountNumber(String.valueOf(JOptionPane.showConfirmDialog(null, "Do you want to create a bank account?", "Final confirmation:", JOptionPane.YES_NO_CANCEL_OPTION)));
                user.setId(UUID.randomUUID());
                JOptionPane.showMessageDialog(null, "Congratulations, your account has been successfully created!", "Confirmation:", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, String.valueOf(user), "Please see your bank details below:", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(user);
                String bankUserDetails = "Bank-user-details.csv";
                this.createBankUserDetailsFile(bankUserDetails);
                this.updateFileContent(bankUserDetails, user);

            }

        }
    }

    public void createBankUserDetailsFile(String fileName) {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully with name: " + fileName);
            } else {
                // do smthg: to delete if current file already exists
                System.out.println("The file already exists");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

        public void updateFileContent(String fileName, User user) {
            try {
                //FileWriter fileWriter = new FileWriter(fileName);// overwrites previous content

                FileWriter fileWriter = new FileWriter(fileName,true);// append mode allows to add content to existing file
                // escape sequences '\n' '\t'
                fileWriter.write(String.valueOf(user));// for each item will give the new item on a new line
                fileWriter.close(); // saves content in a file
                System.out.println("The content has been added to file: " + fileName);

            } catch (IOException exception) {
                exception.printStackTrace();
            }

        } public void deleteFile(String fileName){
        File file = new File(fileName);
        if(file.delete()){
            System.out.println("The file:  " + fileName + "deleted successfully!");
        } else{
            System.out.println("problem deleting the file: " + fileName);
        }
    }


//    public void addContentFromArrayList(String fileName, ArrayList<UserController> userList) {
//        String allContantsAsString = userList
//                .stream()
//                .map(UserController::toString)
//                .collect(Collectors.joining("")); // chaining - process of applying multipile to (might be used simply for loop
//
////        for(SampleContent sampleContent:contentList){
////            allContantsAsString +=sampleContent.toString();
////        }
//
////        this.updateFileContent(fileName, contentList.toString());
//        this.updateFileContent(fileName, userList);
//    }

    @Override
    public String toString() {
        return "user:" + userList;
    }
}

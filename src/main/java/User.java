import javax.swing.*;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String accountNumber;


    public User() {
    }

    public User(UUID id, String name, int age, String gender, String email, String accountNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.accountNumber = accountNumber;

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("0")) {
            this.gender = "MAN";
        } else if (gender.equals("1")) {
            this.gender = "WOMAN";
        } else {
            this.gender = "OTHER";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.equals("0")) {
            this.accountNumber = generateAccountNumber();
        }

    }

    public User createUser(User user) {
        int firstStepAnswer = JOptionPane.showConfirmDialog(null, "Do you want proceed by creating bank account in our bank?", "Do you want to proceed?", JOptionPane.YES_NO_CANCEL_OPTION);
        if (firstStepAnswer != 0) {
            JOptionPane.showMessageDialog(null, "Thanks for visiting our internet bank, looking forward to see you in the future!");
            System.exit(0);
        } else {
            user.setName(JOptionPane.showInputDialog(null, "Please enter your name", "name"));
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
            }

        }return user;
    }


    @Override
    public String toString() {
        return "Your bank account details are:  " +'\n'+
                "name:" + name + '\n' +
                "age:" + age + '\n' +
                "gender:" + gender + '\n' +
                "email:" + email + '\n' +
                "accountNumber:" + accountNumber;
    }

    public String generateAccountNumber() {
        Random randomNumber = new Random();
        String accountNumber = "LT";
        for (int i = 0; i < 18; i++) {
            int n = randomNumber.nextInt(10) + 0;
            accountNumber += Integer.toString(n);
        }
        for (int i = 0; i < 20; i++) {
            if (i % 4 == 0) ;
        }
        return accountNumber;
    }
}



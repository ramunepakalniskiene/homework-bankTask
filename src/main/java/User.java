import javax.swing.*;
import java.net.PasswordAuthentication;
import java.util.Random;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String accountNumber;
    private String password;
    private String userName;


    public User() {
    }

    public User(UUID id, String name, int age, String gender, String email, String accountNumber, String password, String userName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.accountNumber = accountNumber;
        this.password = password;
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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




    @Override
    public String toString() {
        return "Your bank account details are:  " +'\n'+
                "name:" + name + '\n' +
                "user name:" + userName + '\n' +
                "password:" + password + '\n' +
                "age:" + age + '\n' +
                "gender:" + gender + '\n' +
                "email:" + email + '\n' +
                "accountNumber:" + accountNumber+'\n'+
                "==========================="+ "\n";
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



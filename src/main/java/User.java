import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String accountNumber;
    private double balance;

    public User() {
    }

    public User(UUID id, String name, int age, String gender, String email, String accountNumber, double balance) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.accountNumber = accountNumber;
        this.balance = balance;
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
        if(gender.equals(0)) {
            this.gender = "MAN";
        } else if (gender.equals(1)){
            this.gender = "WOMAN";
        }else{
            this.gender="OTHER";
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
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public User createUser(User user){

        return null;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(user.balance, balance) == 0 && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(gender, user.gender) && Objects.equals(email, user.email) && Objects.equals(accountNumber, user.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, email, accountNumber, balance);
    }
}

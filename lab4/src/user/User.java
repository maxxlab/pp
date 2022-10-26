package user;

import java.util.List;

public class User {
    private String userName;
    private String password;
    private boolean discount;

    public User(String userName, String password, boolean discount) {
        this.userName = userName;
        this.password = password;
        this.discount = discount;
    }

    void logIn(String userName, String password, List<User> users){

    }

    void signUp(String userName, String password, List<User> users){

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isDiscount() {
        return discount;
    }
}

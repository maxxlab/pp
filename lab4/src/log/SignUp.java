package log;

import user.User;

import java.util.List;

public class SignUp {
    private List<User> users;

    public SignUp(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

}

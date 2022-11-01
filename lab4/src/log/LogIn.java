package log;

import user.User;

import java.util.List;

public class LogIn {
    private List<User> users;

    public LogIn(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

}

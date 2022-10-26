package log;

import command.Command;
import user.User;
import userMenu.Menu;

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

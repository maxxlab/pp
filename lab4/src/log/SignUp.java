package log;

import command.Command;
import user.User;
import userMenu.Menu;

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

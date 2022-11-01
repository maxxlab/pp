package usermenu;

import command.*;

import java.util.HashMap;
import java.util.Scanner;

public class Menu {
    public static void menuTextPrinter(){
        System.out.println(
                "Welcome to our Train Company!\n" +
                "===== MENU =====\n" +
                "1 Log in\n" +
                "2 Sign up\n" +
                "3 Create train\n" +
                "4 See trains\n" +
                "5 Choose train\n" +
                "6 Exit\n"
        );
    }

    public static int userChoice() {
        Scanner choice = new Scanner(System.in);
        System.out.print("Choose action: ");
        return Integer.parseInt(choice.next());
    }

    public static void menu() {
        menuTextPrinter();
        HashMap<Integer, Command> menuCommands = new HashMap<>();
        menuCommands.put(1, new LogInCommand());
        menuCommands.put(2, new SignUpCommand());
        menuCommands.put(3, new CreateCommand());
        menuCommands.put(4, new SeeCommand());
        menuCommands.put(5, new ChoosingCommand());
        menuCommands.put(6, new ExitCommand());



        while(true){
            menuCommands.get(userChoice()).execute();
        }
    }


}

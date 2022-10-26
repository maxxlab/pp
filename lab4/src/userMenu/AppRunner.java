package userMenu;

import command.*;

import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {
        Menu menu = new Menu(
                new LogInCommand(),
                new SignUpCommand(),
                new CreationCommand(),
                new SeeCommand(),
                new ChoosingCommand()
        );

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("\t\t==== MENU ====\n");
            System.out.println(
                    "0 Exit \n" +
                    "1 Log in \n" +
                    "2 Sign up\n" +
                    "3 Create train\n" +
                    "4 See trains\n" +
                    "5 Choose Train Car\n"
            );
            int choice = scanner.nextInt();
            if (choice == 0){
                break;
            }
            switch(choice){
                case 1: menu.logInRecord(); break;
                case 2: menu.signUpRecord(); break;
                case 3: menu.createTrainRecord(); break;
                case 4: menu.seeTrainsRecord(); break;
                case 5: menu.chooseCarRecord(); break;
                default: break;
            }
        }
    }
}

package userMenu;

import command.Command;

import java.util.Scanner;

public class Menu {
    Command logIn;
    Command signUp;
    Command chooseCar;
    Command seeTrains;
    Command createTrain;

    public Menu(Command logIn, Command signUp, Command createTrain,  Command seeTrains, Command chooseCar ) {
        this.logIn = logIn;
        this.signUp = signUp;
        this.createTrain = createTrain;
        this.seeTrains = seeTrains;
        this.chooseCar = chooseCar;
    }



    public void logInRecord(){
        logIn.execute();
    }

    public void signUpRecord(){
        signUp.execute();
    }

    public void chooseCarRecord(){
        chooseCar.execute();
    }

    public void seeTrainsRecord(){
        seeTrains.execute();
    }

    public void createTrainRecord(){
        createTrain.execute();
    }



}

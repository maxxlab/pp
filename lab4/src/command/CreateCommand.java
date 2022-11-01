package command;

public class CreateCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Create train..");
    }
}

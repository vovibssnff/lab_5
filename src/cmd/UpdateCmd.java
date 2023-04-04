package cmd;

import io.Output_engine;
import managment.CollectionReceiver;

import java.util.Scanner;

public class UpdateCmd implements Command{
    private CollectionReceiver collection_receiver;
    private int id;
    public UpdateCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    @Override
    public void execute(String[] args, Scanner scanner) {
        if (args[0]!=null) {
            try {
                collection_receiver.update(args[0], scanner);
            } catch (RuntimeException e) {
                System.out.println(Output_engine.incorrectLongArg());
            }
        }
    }
    public static String getName() {return "update";}
}

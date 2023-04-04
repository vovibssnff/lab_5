package cmd;

import io.Output_engine;
import managment.CollectionReceiver;

import java.util.Scanner;

public class RemoveByIdCmd implements Command{
    private CollectionReceiver collection_receiver;
    private double id;
    public RemoveByIdCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    @Override
    public void execute(String[] args, Scanner scanner) {
        if (args[0]!=null) {
            try {
                collection_receiver.remove_by_id(Long.parseLong(args[0]));
            } catch (RuntimeException e) {
                System.out.println(Output_engine.incorrectLongArg());
            }
        }
    }
    public static String getName() {return "remove_by_id";}
}

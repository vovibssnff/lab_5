package cmd;

import io.Mode;
import io.Output_engine;
import managment.CollectionReceiver;

import java.util.Scanner;

public class CountLessThanMinimalPointCmd implements Command{
    private CollectionReceiver collection_receiver;
    private double minimalPoint;
    public CountLessThanMinimalPointCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    @Override
    public void execute(String arg, Scanner scanner, Mode mode)  {
        if (arg!=null) {
            try {
                collection_receiver.count_less_than_minimal_point(Double.parseDouble(arg));
            } catch (RuntimeException e) {
                System.out.println(Output_engine.incorrectDoubleArg());
            }
        }
    }
    public static String getName() {return "cltmp";}
}

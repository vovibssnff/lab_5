package cmd;

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
    public void execute(String[] args, Scanner scanner)  {
        if (args[0]!=null) {
            try {
                collection_receiver.count_less_than_minimal_point(Double.parseDouble(args[0]));
            } catch (RuntimeException e) {
                System.out.println(Output_engine.incorrectDoubleArg());
            }
        }
    }
    public static String getName() {return "cltmp";}
}

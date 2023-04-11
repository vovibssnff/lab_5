package cmd;

import io.Mode;
import managment.CollectionReceiver;

import java.util.Scanner;

public class PrintFieldDescendingMinimalPointCmd implements Command {
    private CollectionReceiver collection_receiver;
    private double minimalPoint;
    public PrintFieldDescendingMinimalPointCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.print_field_descending_minimal_point();}
    public static String getName() {return "pfdmp";}
}

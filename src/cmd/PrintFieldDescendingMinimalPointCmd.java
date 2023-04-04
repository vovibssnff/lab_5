package cmd;

import managment.CollectionReceiver;

import java.util.Scanner;

public class PrintFieldDescendingMinimalPointCmd implements Command {
    private CollectionReceiver collection_receiver;
    private double minimalPoint;
    public PrintFieldDescendingMinimalPointCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    @Override
    public void execute(String[] args, Scanner scanner) {collection_receiver.print_field_descending_minimal_point();}
    public static String getName() {return "pfdmp";}
}

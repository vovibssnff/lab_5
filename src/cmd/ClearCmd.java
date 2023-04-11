package cmd;

import io.Mode;
import managment.CollectionReceiver;

import java.util.Scanner;

public class ClearCmd implements Command{
    private CollectionReceiver collection_receiver;
    public ClearCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.clear();}
    public static String getName() {return "clear";}
}

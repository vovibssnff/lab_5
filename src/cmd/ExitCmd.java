package cmd;

import io.Mode;
import managment.CollectionReceiver;

import java.util.Scanner;

public class ExitCmd implements Command {
    private CollectionReceiver collection_receiver;
    public ExitCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.exit();}
    public static String getName() {return "exit";}
}

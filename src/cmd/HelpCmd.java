package cmd;
import managment.*;

import java.util.Scanner;

public class HelpCmd implements Command {
    private CollectionReceiver collection_receiver;
    public HelpCmd(CollectionReceiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    public void execute(String[] args, Scanner scanner) {
        collection_receiver.help();
    }
    public static String getName() {return "help";}
}

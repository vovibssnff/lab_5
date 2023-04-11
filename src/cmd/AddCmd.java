package cmd;
import io.Mode;
import managment.*;

import java.util.Scanner;

public class AddCmd implements Command {
    private CollectionReceiver collection_receiver;
    public AddCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}

    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.add_elem(scanner, mode);}
    public static String getName() {
        return "add";
    }
}

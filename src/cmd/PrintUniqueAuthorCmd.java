package cmd;

import io.Mode;
import managment.CollectionReceiver;

import java.util.Scanner;

public class PrintUniqueAuthorCmd implements Command {
    private CollectionReceiver collection_receiver;
    public PrintUniqueAuthorCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.print_unique_author();}
    public static String getName() {return "print_unique_authors";}
}

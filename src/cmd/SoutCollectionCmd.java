package cmd;
import io.Mode;
import managment.*;

import java.util.Scanner;

public class SoutCollectionCmd implements Command{
    private CollectionReceiver collection_receiver;
    public SoutCollectionCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String args, Scanner scanner, Mode mode) {collection_receiver.sout_collection();}
    public static String getName() {return "show";}
}

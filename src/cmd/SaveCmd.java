package cmd;

import io.Mode;
import managment.CollectionReceiver;

import java.util.Scanner;

public class SaveCmd implements Command{
    private CollectionReceiver collection_receiver;
    public SaveCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String arg, Scanner scanner, Mode mode) {collection_receiver.save();}
    public static String getName() {return "save";}
}

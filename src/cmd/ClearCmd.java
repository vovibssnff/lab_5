package cmd;

import managment.CollectionReceiver;

import java.util.Scanner;

public class ClearCmd implements Command{
    private CollectionReceiver collection_receiver;
    public ClearCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String[] args, Scanner scanner) {collection_receiver.clear();}
    public static String getName() {return "clear";}
}

package cmd;

import managment.CollectionReceiver;

import java.util.Scanner;

public class HistoryCmd implements Command{
    private CollectionReceiver collection_receiver;
    public HistoryCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String[] args, Scanner scanner) {collection_receiver.history();}
    public static String getName() {return "history";}
}

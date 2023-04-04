package cmd;

import managment.CollectionReceiver;

import java.util.Scanner;

public class InfoCmd implements Command{
    private CollectionReceiver collection_receiver;
    public InfoCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String[] args, Scanner scanner) {collection_receiver.info();}
    public static String getName() {return "info";}
}

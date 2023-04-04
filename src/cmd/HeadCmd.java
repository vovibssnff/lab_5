package cmd;

import managment.CollectionReceiver;

import java.util.Scanner;

public class HeadCmd implements Command{
    private CollectionReceiver collection_receiver;
    public HeadCmd(CollectionReceiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute(String[] args, Scanner scanner) {collection_receiver.head();}
    public static String getName() {return "head";}
}

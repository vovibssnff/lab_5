package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_clear implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_clear(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.clear();}
    public static String getName() {return "clear";}
}

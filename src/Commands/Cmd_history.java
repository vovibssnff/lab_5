package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_history implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_history(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.history();}
    public static String getName() {return "history";}
}

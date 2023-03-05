package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_head implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_head(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.head();}
    public static String getName() {return "head";}
}

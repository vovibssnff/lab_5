package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_save implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_save(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.save();}
    public static String getName() {return "save";}
}

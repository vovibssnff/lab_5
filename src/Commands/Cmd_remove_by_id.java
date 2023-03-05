package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_remove_by_id implements Command{
    private Collection_receiver collection_receiver;
    private int id;
    Cmd_remove_by_id(Collection_receiver collection_receiver, int id) {
        this.collection_receiver=collection_receiver;
        this.id=id;
    }
    @Override
    public void execute() {collection_receiver.remove_by_id(this.id);}
    public static String getName() {return "remove_by_id";}
}

package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_update implements Command{
    private Collection_receiver collection_receiver;
    private int id;
    public Cmd_update(Collection_receiver collection_receiver, int id) {
        this.collection_receiver=collection_receiver;
        this.id=id;
    }
    @Override
    public void execute() {collection_receiver.update(this.id);}
    public static String getName() {return "update";}
}

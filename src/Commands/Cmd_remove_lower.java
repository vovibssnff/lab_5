package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_remove_lower implements Command{
    private Collection_receiver collection_receiver;
    private int id;
    public Cmd_remove_lower(Collection_receiver collection_receiver, int id) {
        this.collection_receiver=collection_receiver;
        this.id=id;
    }
    @Override
    public void execute() {
        collection_receiver.remove_lower(this.id);
    }
    public String getName() {return "remove_lower";}
}

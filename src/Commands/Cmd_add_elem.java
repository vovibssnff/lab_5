package Commands;
import Collection_managment.*;
public class Cmd_add_elem implements Command {
    private Collection_receiver collection_receiver;
    public Cmd_add_elem(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}

    @Override
    public void execute() {collection_receiver.add_elem();}
    public static String getName() {
        return "add";
    }
}

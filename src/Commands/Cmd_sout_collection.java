package Commands;
import Collection_managment.*;
public class Cmd_sout_collection implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_sout_collection(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.sout_collection();}
    public static String getName() {return "show";}
}

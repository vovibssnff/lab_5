package Commands;
import Collection_managment.*;
public class Cmd_help implements Command {
    private Collection_receiver collection_receiver;
    public Cmd_help(Collection_receiver collection_receiver) {
        this.collection_receiver=collection_receiver;
    }
    public void execute() {
        collection_receiver.help();
    }
    public static String getName() {return "help";}
}

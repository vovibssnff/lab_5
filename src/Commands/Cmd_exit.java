package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_exit implements Command {
    private Collection_receiver collection_receiver;
    public Cmd_exit(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.exit();}
    public static String getName() {return "exit";}
}

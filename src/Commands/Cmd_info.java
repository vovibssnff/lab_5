package Commands;

import Collection_managment.Collection_receiver;
import Collection_managment.Collections;

public class Cmd_info implements Command{
    private Collection_receiver collection_receiver;
    public Cmd_info(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.info();}
    public static String getName() {return "info";}
}

package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_execute_script implements Command{
    private Collection_receiver collection_receiver;
    private String scriptname;
    Cmd_execute_script(Collection_receiver collection_receiver, String scriptname) {
        this.collection_receiver=collection_receiver;
        this.scriptname=scriptname;
    }
    @Override
    public void execute() {collection_receiver.execute_script(this.scriptname);}
    public static String getName() {return "execute_script";}
}

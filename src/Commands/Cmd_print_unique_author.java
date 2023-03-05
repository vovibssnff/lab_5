package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_print_unique_author implements Command {
    private Collection_receiver collection_receiver;
    public Cmd_print_unique_author(Collection_receiver collection_receiver) {this.collection_receiver=collection_receiver;}
    @Override
    public void execute() {collection_receiver.print_unique_author();}
    public static String getName() {return "print_unique_author";}
}

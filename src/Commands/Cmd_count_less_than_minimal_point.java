package Commands;

import Collection_managment.Collection_receiver;

public class Cmd_count_less_than_minimal_point implements Command{
    private Collection_receiver collection_receiver;
    private double minimalPoint;
    Cmd_count_less_than_minimal_point(Collection_receiver collection_receiver, double minimalPoint) {
        this.collection_receiver=collection_receiver;
        this.minimalPoint=minimalPoint;
    }
    @Override
    public void execute() {collection_receiver.count_less_than_minimal_point(this.minimalPoint);}
    public static String getName() {return "cltmp";}

}

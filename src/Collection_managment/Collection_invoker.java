package Collection_managment;
import Commands.*;
public class Collection_invoker {
    private Command help;
    private Command info;
    private Command sout_collection;
    private Command add_elem;
    private Command update;
    private Command remove_by_id;
    private Command clear;
    private Command save;
    private Command execute_script;
    private Command exit;
    private Command head;
    private Command remove_lower;
    private Command history;
    private Command count_less_than_minimal_point;
    private Command print_unique_author;
    private Command print_field_descending_minimal_point;
    public Collection_invoker(Command help, Command info, Command sout_collection, Command add_elem, Command update,
                              Command remove_by_id, Command clear, Command save, Command execute_script, Command exit,
                              Command head, Command remove_lower, Command history, Command count_less_than_minimal_point,
                              Command print_unique_author, Command print_field_descending_minimal_point) {
        this.help=help;
        this.info=info;
        this.sout_collection=sout_collection;
        this.add_elem=add_elem;
        this.update=update;
        this.remove_by_id=remove_by_id;
        this.clear=clear;
        this.save=save;
        this.execute_script=execute_script;
        this.exit=exit;
        this.head=head;
        this.remove_lower=remove_lower;
        this.history=history;
        this.count_less_than_minimal_point=count_less_than_minimal_point;
        this.print_unique_author=print_unique_author;
        this.print_field_descending_minimal_point=print_field_descending_minimal_point;
    }
    void cmd_help() {help.execute();}
    void cmd_info() {info.execute();}
    void cmd_sout_collection() {sout_collection.execute();}
    void cmd_add_elem() {add_elem.execute();}
    void cmd_update_id() {update.execute();}
    void cmd_remove_by_id() {remove_by_id.execute();}
    void cmd_clear() {clear.execute();}
    void cmd_save() {save.execute();}
    void cmd_execute_script() {execute_script.execute();}
    void cmd_exit() {exit.execute();}
    void cmd_head() {head.execute();}
    void cmd_remove_lower() {remove_lower.execute();}
    void cmd_history() {history.execute();}
    void cmd_count_less_than_minimal_point() {count_less_than_minimal_point.execute();}
    void cmd_print_unique_author() {print_unique_author.execute();}
    void cmd_print_field_descending_minimal_point() {print_field_descending_minimal_point.execute();}
}

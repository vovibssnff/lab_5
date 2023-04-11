package managment;
import cmd.*;
import io.Mode;

import java.util.Scanner;

/**
 * Класс-инвокер для реализации паттерна "команда"
 */
public class CollectionInvoker {
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
    public CollectionInvoker(Command help, Command info, Command sout_collection, Command add_elem, Command update,
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
    void cmd_info(String arg, Scanner scanner, Mode mode) {info.execute(arg, scanner, mode);}
    void cmd_help(String arg, Scanner scanner, Mode mode) {help.execute(arg, scanner, mode);}
    void cmd_sout_collection(String arg, Scanner scanner, Mode mode) {sout_collection.execute(arg, scanner, mode);}
    void cmd_add_elem(String arg, Scanner scanner, Mode mode) {add_elem.execute(arg, scanner, mode);}
    void cmd_update_id(String arg, Scanner scanner, Mode mode) {update.execute(arg, scanner, mode);}
    void cmd_remove_by_id(String arg, Scanner scanner, Mode mode) {remove_by_id.execute(arg, scanner, mode);}
    void cmd_clear(String arg, Scanner scanner, Mode mode) {clear.execute(arg, scanner, mode);}
    void cmd_save(String arg, Scanner scanner, Mode mode) {save.execute(arg, scanner, mode);}
    void cmd_execute_script(String arg, Scanner scanner, Mode mode) {execute_script.execute(arg, scanner, mode);}
    void cmd_exit(String arg, Scanner scanner, Mode mode) {exit.execute(arg, scanner, mode);}
    void cmd_head(String arg, Scanner scanner, Mode mode) {head.execute(arg, scanner, mode);}
    void cmd_remove_lower(String arg, Scanner scanner, Mode mode) {remove_lower.execute(arg, scanner, mode);}
    void cmd_history(String arg, Scanner scanner, Mode mode) {history.execute(arg, scanner, mode);}
    void cmd_count_less_than_minimal_point(String arg, Scanner scanner, Mode mode) {count_less_than_minimal_point.execute(arg, scanner, mode);}
    void cmd_print_unique_author(String arg, Scanner scanner, Mode mode) {print_unique_author.execute(arg, scanner, mode);}
    void cmd_print_field_descending_minimal_point(String arg, Scanner scanner, Mode mode) {print_field_descending_minimal_point.execute(arg, scanner, mode);}
}

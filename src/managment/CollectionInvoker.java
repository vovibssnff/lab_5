package managment;
import cmd.*;

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
    void cmd_help(String[] args, Scanner scanner) {help.execute(args, scanner);}
    void cmd_info(String[] args, Scanner scanner) {info.execute(args, scanner);}
    void cmd_sout_collection(String[] args, Scanner scanner) {sout_collection.execute(args, scanner);}
    void cmd_add_elem(String[] args, Scanner scanner) {add_elem.execute(args, scanner);}
    void cmd_update_id(String[] args, Scanner scanner) {update.execute(args, scanner);}
    void cmd_remove_by_id(String[] args, Scanner scanner) {remove_by_id.execute(args, scanner);}
    void cmd_clear(String[] args, Scanner scanner) {clear.execute(args, scanner);}
    void cmd_save(String[] args, Scanner scanner) {save.execute(args, scanner);}
    void cmd_execute_script(String[] args, Scanner scanner) {execute_script.execute(args, scanner);}
    void cmd_exit(String[] args, Scanner scanner) {exit.execute(args, scanner);}
    void cmd_head(String[] args, Scanner scanner) {head.execute(args, scanner);}
    void cmd_remove_lower(String[] args, Scanner scanner) {remove_lower.execute(args, scanner);}
    void cmd_history(String[] args, Scanner scanner) {history.execute(args, scanner);}
    void cmd_count_less_than_minimal_point(String[] args, Scanner scanner) {count_less_than_minimal_point.execute(args, scanner);}
    void cmd_print_unique_author(String[] args, Scanner scanner) {print_unique_author.execute(args, scanner);}
    void cmd_print_field_descending_minimal_point(String[] args, Scanner scanner) {print_field_descending_minimal_point.execute(args, scanner);}
}

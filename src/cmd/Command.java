package cmd;


import java.util.Scanner;

public interface Command {
    public void execute(String[] args, Scanner scanner);
}

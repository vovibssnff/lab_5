package cmd;


import io.Mode;

import java.util.Scanner;

public interface Command {
    public void execute(String arg, Scanner scanner, Mode mode);
}

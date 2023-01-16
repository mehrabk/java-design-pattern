package org.example.command;

import org.example.command.fx.Command;

public class FilterCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Filter Image");
    }
}

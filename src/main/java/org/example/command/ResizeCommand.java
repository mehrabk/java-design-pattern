package org.example.command;

import org.example.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize Image");
    }
}

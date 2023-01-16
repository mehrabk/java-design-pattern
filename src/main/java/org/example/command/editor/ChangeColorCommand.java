package org.example.command.editor;

public class ChangeColorCommand implements UndoableCommand {
    private String prevColor;
    private String color;
    private HtmlDocument document;
    private History history;

    public ChangeColorCommand(String color, HtmlDocument document, History history) {
        this.color = color;
        this.document = document;
        this.history = history;
    }

    @Override
    public void execute() {
        prevColor = document.getColor();
        document.setColor(color);
        history.push(this);
    }

    @Override
    public void unexecute() {
        document.setColor(prevColor);
    }
}

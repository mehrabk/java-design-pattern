package org.example.command.editor;

public class HtmlDocument {
    private String content;
    private String color;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HtmlDocument{" +
                "content='" + content + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

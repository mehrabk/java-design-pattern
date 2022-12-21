package org.example.memento;

public class Editor {
    private String content;

    private String firstName;

    public EditorState createState() {
        return new EditorState(content, firstName);
    }

    public void restore(EditorState state) {
        content = state.getContent();
        firstName = state.getFirstName();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

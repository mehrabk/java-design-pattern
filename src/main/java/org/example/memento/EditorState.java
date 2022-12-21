package org.example.memento;

// like a wrapper of states (we define class for states that can have any type of state)
public class EditorState {
    private final String content;

    private String firstName;

    public EditorState(String content, String firstName) {
        this.content = content;
        this.firstName = firstName;
    }

    public String getContent() {
        return content;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "EditorState{" +
                "content='" + content + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

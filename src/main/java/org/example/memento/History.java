package org.example.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states = new ArrayList<>();
    public void push(EditorState state) {
        states.add(state);
        System.out.println(states);
    }

    public EditorState pop() {
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;
    }
}

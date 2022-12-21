package org.example;

import org.example.memento.Editor;
import org.example.memento.History;

public class Main {
    public static void main(String[] args) {
        // memento design-pattern
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        editor.setFirstName("mehrab1");
        history.push(editor.createState());

        editor.setContent("b");
        editor.setFirstName("mehrab2");
        history.push(editor.createState());

        editor.setContent("c");
        editor.setFirstName("mehrab3");
        editor.restore(history.pop());

        System.out.println(editor.toString());
    }
}
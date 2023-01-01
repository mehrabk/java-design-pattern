package org.example;

import org.example.memento.Editor;
import org.example.memento.History;
import org.example.state.Canvas;
import org.example.state.SelectionTool;

public class Main {
    public static void main(String[] args) {
        // memento demo
//        Editor editor = new Editor();
//        History history = new History();
//
//        editor.setContent("a");
//        editor.setFirstName("mehrab1");
//        history.push(editor.createState());
//
//        editor.setContent("b");
//        editor.setFirstName("mehrab2");
//        history.push(editor.createState());
//
//        editor.setContent("c");
//        editor.setFirstName("mehrab3");
//        editor.restore(history.pop());
//
//        System.out.println(editor.toString());

        //state demo
        // we change behavior of canvas when change the state of tool (polymorphism & inherites & oop) => open(fo extend) closed(for modification) principal
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

    }
}
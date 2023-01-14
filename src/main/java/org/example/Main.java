package org.example;

import org.example.iterator.BrowseHistory;
import org.example.iterator.Iterator;
import org.example.memento.Editor;
import org.example.memento.History;
import org.example.state.Canvas;
import org.example.state.SelectionTool;
import org.example.strategy.BlackAndWhiteFilter;
import org.example.strategy.Compressor;
import org.example.strategy.ImageStorage;
import org.example.strategy.JpegCompressor;
import org.example.templateMethod.Task;
import org.example.templateMethod.TransferMoneyTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //================================================= memento demo
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

        //================================================= state demo
        // we change behavior of canvas when change the state of tool (polymorphism & inherites & oop) => open(fo extend) closed(for modification) principal
//        Canvas canvas = new Canvas();
//        canvas.setCurrentTool(new SelectionTool());
//        canvas.mouseDown();
//        canvas.mouseUp();

        //================================================= iterator
//        BrowseHistory history = new BrowseHistory();
//        history.push("mehrab1");
//        history.push("mehrab2");
//        history.push("mehrab3");
//        Iterator iterator = history.createIterator();
//
//        while(iterator.hasNext()) {
//            System.out.println(iterator.current());
//            iterator.next();
//        }
//
        //================================================= strategy
//        ImageStorage imageStorage = new ImageStorage();
//        imageStorage.store("myFileName", new JpegCompressor(), new BlackAndWhiteFilter());

        //================================================= template method
        //1- remove repetetive code 2- force follow structure
        Task task = new TransferMoneyTask();
        task.execute();

    }
}
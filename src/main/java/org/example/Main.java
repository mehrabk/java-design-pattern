package org.example;

import org.example.chain.*;
import org.example.command.*;
import org.example.command.editor.*;
import org.example.command.fx.Button;
import org.example.command.fx.Command;
import org.example.iterator.BrowseHistory;
import org.example.iterator.Iterator;
import org.example.mediator.ArticlesDialogBox;
import org.example.mediator.DialogBox;
import org.example.mediator.observerWay.SinglePanelChartAnalytic;
import org.example.memento.Editor;
import org.example.observer.*;
import org.example.state.Canvas;
import org.example.state.SelectionTool;
import org.example.strategy.BlackAndWhiteFilter;
import org.example.strategy.ImageStorage;
import org.example.strategy.JpegCompressor;
import org.example.templateMethod.Task;
import org.example.templateMethod.TransferMoneyTask;
import org.example.visitor.*;
import org.example.visitor.HtmlDocument;

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
//        1- remove repetetive code 2- force follow structure
//        Task task = new TransferMoneyTask();
//        task.execute();
        //================================================= Command
//        CustomerService service = new CustomerService();
//        Command command = new AddCustomerCommand(service);
//        Button button = new Button(command);
//        button.onClick();
//
//        // composite commands
//        CompositeCommand compositeCommand = new CompositeCommand();
//        compositeCommand.add(new ResizeCommand());
//        compositeCommand.add(new FilterCommand());
//        compositeCommand.execute();
//
//        // editor
//        History history = new History();
//        UndoCommand undo = new UndoCommand(history);
//        HtmlDocument document = new HtmlDocument();
//        document.setContent("mehrab");
//        document.setColor("red");
//
//        BoldCommand boldCommand = new BoldCommand(document, history);
//        boldCommand.execute();
//
//        ChangeColorCommand changeColorCommand = new ChangeColorCommand("blue", document, history);
//        changeColorCommand.execute();
//
//        System.out.println(document);
//
//        undo.execute();
//        undo.execute();
//        System.out.println(document);
        //================================================= observer
//        // for notify other class when change state
//        // publisher
//        DataSource dataSource = new DataSource();
//
//        // subcriber
//        Observer subcriber1 = new Chart(dataSource);
//        Observer subcriber2 = new SpreadSheet(dataSource);
//
//        dataSource.add(subcriber1);
//        dataSource.add(subcriber2);
//
//        dataSource.setValue(12);

        //================================================= mediator
//        ArticlesDialogBox dialogBox = new ArticlesDialogBox();
//        dialogBox.simulateUserInteraction();
//
//        SinglePanelChartAnalytic chart = new SinglePanelChartAnalytic();
//        chart.simulateUserInteraction();
        //================================================= chain of responsibility
//        // athenticator -> looger -> compressor (pipeline)
//        Compressor compressor = new Compressor(null);
//        Logger logger = new Logger(compressor);
//        Authenticator authenticator = new Authenticator(logger);
//        WebServer server = new WebServer(authenticator);
//        server.handle(new HttpRequest("admin", "1234"));
        //================================================= visitor
        HtmlDocument document = new HtmlDocument();
        document.add(new AnchorNode());
        document.add(new HeadingNode());
//        document.execute(new HighlighOperation());
        document.execute(new PlainTextOperation());
    }
}
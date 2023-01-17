package org.example.mediator.observerWay;

import java.util.ArrayList;
import java.util.List;

public class UIChartControl {
    private List<EventHandler> handlers = new ArrayList<>();

    public void addEventHandler(EventHandler handler) {
        handlers.add(handler);
    }

    protected void notifyEventHandlers() {
        for(EventHandler handler: handlers) {
            handler.handle();
        }
    }
}

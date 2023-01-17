package org.example.mediator.observerWay;

public class HighChartController extends UIChartControl {
    private boolean isEnabled;
    public boolean isEnabled() {return isEnabled;}
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}

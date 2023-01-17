package org.example.mediator.observerWay;

public class KendoChartController extends UIChartControl {
    private boolean isEnabled;
    public boolean isEnabled() {return isEnabled;}
    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }
}

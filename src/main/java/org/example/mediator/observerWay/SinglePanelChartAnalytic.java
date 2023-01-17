package org.example.mediator.observerWay;

public class SinglePanelChartAnalytic {
    HighChartController highChartController = new HighChartController();
    JQPlotController jqPlotController = new JQPlotController();
    KendoChartController kendoChartController = new KendoChartController();
    RGraphController rGraphController = new RGraphController();

    public SinglePanelChartAnalytic() {
        highChartController.addEventHandler(() -> {
            if(highChartController.isEnabled()) {
                jqPlotController.setEnabled(true);
                kendoChartController.setEnabled(true);
                rGraphController.setEnabled(false);
            }
        });
    }

    public void simulateUserInteraction() {
        highChartController.setEnabled(true);
        System.out.println("jqPlotController: " + jqPlotController.isEnabled());
        System.out.println("kendoChartController: " + kendoChartController.isEnabled());
        System.out.println("rGraphController: " + rGraphController.isEnabled());
    }
}

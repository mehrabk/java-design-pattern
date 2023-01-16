package org.example.observer;

public class Chart implements Observer {
    // pull style / push style => here is pull style and what we need can request (dataSource.getValue())
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("chart observer got " + dataSource.getValue());
    }
}

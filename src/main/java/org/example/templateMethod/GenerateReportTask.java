package org.example.templateMethod;

public class GenerateReportTask extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Generate Report");
    }
}
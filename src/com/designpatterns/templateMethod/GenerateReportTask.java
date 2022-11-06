package com.designpatterns.templateMethod;

public class GenerateReportTask extends Task {

    public GenerateReportTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Generating report");
    }
}

package com.designpatterns.templateMethod;

public class MoneyTransferTask extends Task {

    public MoneyTransferTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    protected void doExecute() {
        System.out.println("Executing Money Transfer...");
    }
}

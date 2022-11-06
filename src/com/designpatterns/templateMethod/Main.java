package com.designpatterns.templateMethod;

public class Main {
    public static void main(String[] args) {

        var auditTrail = new AuditTrail();

        var mtt = new MoneyTransferTask(auditTrail);

        mtt.execute();


    }
}

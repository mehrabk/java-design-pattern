package org.example.templateMethod;

public abstract class Task {
    private AuditTrail auditTrail;

    // default constructor
    public Task() {
        this.auditTrail = new AuditTrail();
    }

    // we can pass our arbitrary auditTrail (usefull if we want share auditTrail amoung of many tasks)
    // AuditTrail can be interface and we can decouple the task class from auditTrail class and swap the implementation on auditTrail from outside
    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }
    public void execute() {
        auditTrail.record();
        doExecute();
    }

    // hooks method (we set modifire protected for accessable child class (override))
    protected abstract void doExecute();
}

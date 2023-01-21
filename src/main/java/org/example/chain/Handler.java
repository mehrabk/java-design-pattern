package org.example.chain;

public abstract class Handler {
    private Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handle(HttpRequest request) {
        if(doHandle(request)) return; //check itself (request = true => process end)
        if(next != null) next.handle(request); // check next (next = null => latest handler)
    }

    public abstract boolean doHandle(HttpRequest request);
}

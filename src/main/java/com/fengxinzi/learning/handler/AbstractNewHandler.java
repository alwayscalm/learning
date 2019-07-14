package com.fengxinzi.learning.handler;

public abstract class AbstractNewHandler<P extends Request, R extends Response> extends AbstractHandler<P, R> {

    @Override
    protected void execute(P request, R response) {
        doExecute(request, response);
    }

    protected abstract void doExecute(P request, R response);
}

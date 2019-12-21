package com.github.badsyntax.gradletasks.server.actions;

public class ActionException extends Exception {
    public ActionException(String message) {
        super(message);
    }

    public ActionException(String message, Throwable cause) {
        super(message, cause);
    }
}

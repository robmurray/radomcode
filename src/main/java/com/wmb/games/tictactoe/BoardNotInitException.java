package com.wmb.games.tictactoe;

/**
 * Created by rob on 3/31/15.
 */
public class BoardNotInitException extends Exception {
    public BoardNotInitException() {
    }

    public BoardNotInitException(String message) {
        super(message);
    }

    public BoardNotInitException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoardNotInitException(Throwable cause) {
        super(cause);
    }

    public BoardNotInitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

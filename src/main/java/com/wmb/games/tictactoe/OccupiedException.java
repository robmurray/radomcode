package com.wmb.games.tictactoe;

/**
 * Created by rob on 3/31/15.
 */
public class OccupiedException extends Exception {
    public OccupiedException() {
    }

    public OccupiedException(String message) {
        super(message);
    }

    public OccupiedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OccupiedException(Throwable cause) {
        super(cause);
    }

    public OccupiedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

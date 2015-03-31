package com.wmb.games.tictactoe;

/**
 * Created by rob on 3/31/15.
 */
public class MoveOutOfBoundsException extends Exception {
    public MoveOutOfBoundsException() {
    }

    public MoveOutOfBoundsException(String message) {
        super(message);
    }

    public MoveOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public MoveOutOfBoundsException(Throwable cause) {
        super(cause);
    }

    public MoveOutOfBoundsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

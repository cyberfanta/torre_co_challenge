package com.cyberfanta.torre_co_challenge.logics.exceptions;

public class ConnectionException extends Exception{
    String i;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public ConnectionException(String i) {
        this.i = i;
    }
}

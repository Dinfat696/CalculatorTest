package com.example.calctets;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NullException extends Exception {
    public NullException() {
    }

    public NullException(String message) {
        super(message);
    }

    public NullException(String message, Throwable cause) {
        super(message, cause);
    }

    public NullException(Throwable cause) {
        super(cause);
    }

    public NullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

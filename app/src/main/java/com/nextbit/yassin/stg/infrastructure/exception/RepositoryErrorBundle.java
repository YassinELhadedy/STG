package com.nextbit.yassin.stg.infrastructure.exception;

import com.nextbit.yassin.stg.domain.exception.ErrorBundle;

/**
 * Created by yassin on 9/13/17.
 */

public class RepositoryErrorBundle implements ErrorBundle {

    private final Exception exception;

    RepositoryErrorBundle(Exception exception) {
        this.exception = exception;
    }

    @Override
    public Exception getException() {
        return exception;
    }

    @Override
    public String getErrorMessage() {
        String message = "";
        if (this.exception != null) {
            message = this.exception.getMessage();
        }
        return message;
    }
}

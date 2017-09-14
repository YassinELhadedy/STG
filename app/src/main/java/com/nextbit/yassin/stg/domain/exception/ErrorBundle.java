package com.nextbit.yassin.stg.domain.exception;

/**
 * Created by yassin on 9/13/17.
 */

public interface ErrorBundle {
    Exception getException();

    String getErrorMessage();
}

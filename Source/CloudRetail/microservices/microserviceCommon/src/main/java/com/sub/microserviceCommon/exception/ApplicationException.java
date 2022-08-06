/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 7:57:10 AM
 *
 */
package com.sub.microserviceCommon.exception;

import com.sub.microserviceCommon.domain.response.ApplicationResponse;

/**
 * @author Subrata Dey
 * ApplicationException.java
 */
public class ApplicationException extends RuntimeException {
    private ApplicationResponse error;

    /**
     *
     */
    public ApplicationException(ApplicationResponse error) {
        super(error.getCaption());
        setError(error);
    }

    public ApplicationException(ApplicationResponse error, Throwable cause) {
        super(error.getCaption(), cause);
        setError(error);
    }

    /**
     * @return errcode
     */
    public ApplicationResponse getError() {
        return error;
    }

    /**
     * @param errcode セットする errcode
     */
    private void setError(ApplicationResponse error) {
        this.error = error;
    }

}

/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 8:01:03 AM
 *
 */
package com.sub.inventoryManagement.exception;

import com.sub.microserviceCommon.domain.response.ApplicationResponse;
import com.sub.microserviceCommon.exception.ApplicationException;

/**
 * @author Subrata Dey
 * InventoryManagementException.java
 * 
 * InventoryManagementException
 * Exception class defined for Inventory Management MS application
 * Service layer throws this application Exception
 * when some processing error condition/exception is encountered during API processing
*/
public class InventoryManagementException extends ApplicationException {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = -3568465615410384238L;



    /**
     * Custom Exception for handling application specific errors
     *
     * @param inventoryManagementExceptionError
     * @param cause
     */
    public InventoryManagementException(ApplicationResponse inventoryManagementExceptionError, Throwable cause) {
        super(inventoryManagementExceptionError, cause);

    }

    /**
     *
     * @param inventoryManagementExceptionError
     */
    public InventoryManagementException(ApplicationResponse inventoryManagementExceptionError) {
        super(inventoryManagementExceptionError);

    }
}

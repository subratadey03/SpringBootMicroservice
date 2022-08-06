/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 8:10:00 AM
 *
 */
package com.sub.inventoryManagement.constent;

import com.sub.microserviceCommon.exception.ApplicationError;

/**
 * @author Subrata Dey
 * InventoryManagementError.java
 */
public enum InventoryManagementError implements ApplicationError{
    
    UNEXPECTEDERROR(-1, "error.unexpected");

    private final String caption;
    private final Integer code;

    InventoryManagementError(final Integer code, final String caption) {
        this.code = code;
        this.caption = caption;
    }
    
    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getCaption() {
        return caption;
    }
}

/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 8:15:46 AM
 *
 */
package com.sub.inventoryManagement.constent;

import com.sub.microserviceCommon.domain.response.ApplicationResponse;

/**
 * @author Subrata Dey
 * InventoryManagementSuccess.java
 */
public enum InventoryManagementSuccess implements ApplicationResponse {

    INVETORY_UPDATE_SUCCESS(0, "inventory.update.success"),
    ITEM_INFO_UPDATE_SUCCESS(0, "item.info.update.success");

    private final String caption;
    private final Integer code;

    InventoryManagementSuccess(final Integer code, final String caption) {
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

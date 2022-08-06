/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 11:09:02 AM
 *
 */
package com.sub.inventoryManagement.domain.external.response;

import com.sub.microserviceCommon.constent.CloudRetailConstent;
import com.sub.microserviceCommon.domain.response.CloudRetailResponse;
import com.sub.microserviceCommon.domain.response.Result;

/**
 * @author Subrata Dey
 * InventoryManagementResponse.java
 */
public abstract class InventoryManagementResponse extends CloudRetailResponse {
    /**
     * InventoryManagementResponse constructor
     * Common response class for all the API(s) of Inventory Management MS
     */
    public InventoryManagementResponse() {
        Result result = new Result();
        result.setMs(CloudRetailConstent.INVENTORY_MGMT_MS_NO);
        setResult(result);
    }

}

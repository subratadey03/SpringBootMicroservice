/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 11:28:00 AM
 *
 */
package com.sub.inventoryManagement.domain.external.response;

import com.sub.inventoryManagement.constent.InventoryManagementAPI;

/**
 * @author Subrata Dey
 * AddItemInventroyResponse.java
 */
public class ItemInventroyResponse extends InventoryManagementResponse{

    /**
    *
    * @param apiName
    */
   public ItemInventroyResponse(InventoryManagementAPI apiName) {
       super();
       getResult().setApi(apiName.getApiNo());
   }
}

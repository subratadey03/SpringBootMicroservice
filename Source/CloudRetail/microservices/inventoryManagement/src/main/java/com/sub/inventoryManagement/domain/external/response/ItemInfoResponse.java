/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 12:19:11 PM
 *
 */
package com.sub.inventoryManagement.domain.external.response;

import com.sub.inventoryManagement.constent.InventoryManagementAPI;

/**
 * @author Subrata Dey
 * AddNewItemInfoResponse.java
 */
public class ItemInfoResponse extends InventoryManagementResponse {

    /**
    *
    * @param apiName
    */
   public ItemInfoResponse(InventoryManagementAPI apiName) {
       super();
       getResult().setApi(apiName.getApiNo());
   }
}

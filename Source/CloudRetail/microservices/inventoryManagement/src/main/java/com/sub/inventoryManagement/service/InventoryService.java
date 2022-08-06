/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:23:26 PM
 *
 */
package com.sub.inventoryManagement.service;

import java.util.List;
import com.sub.inventoryManagement.domain.internal.InventoryInfo;
import com.sub.inventoryManagement.domain.internal.ItemInfo;

/**
 * @author Subrata Dey
 * InventoryService.java
 */
public interface InventoryService {

    /**
     * 
     * updateInventory
     * @param itemInventoryInfos
     */
    public void updateInventory(List<InventoryInfo> itemInventoryInfos);
    
    /**
     * 
     * updateItemInfo
     * @param itemInfos
     */
    public void updateItemInfo(List<ItemInfo> itemInfos);

}

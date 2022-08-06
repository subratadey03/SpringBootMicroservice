/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:23:47 PM
 *
 */
package com.sub.inventoryManagement.service;

import java.util.List;
import org.modelmapper.ModelMapper;
import com.google.common.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sub.inventoryManagement.domain.entity.InventoryEntity;
import com.sub.inventoryManagement.domain.entity.ItemEntity;
import com.sub.inventoryManagement.domain.internal.InventoryInfo;
import com.sub.inventoryManagement.domain.internal.ItemInfo;

/**
 * @author Subrata Dey
 *         InventoryServiceImpl.java
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private ModelMapper modelmapper;

    @Autowired
    private InventoryTransactionHelper inventoryTransactionHelper;

    @Override
    public void updateInventory(List<InventoryInfo> itemInventoryInfos) {
        List<InventoryEntity> inventoryEntityList = modelmapper.map(itemInventoryInfos,
                new TypeToken<List<InventoryEntity>>() {}.getType());
        inventoryTransactionHelper.SaveAllInventory(inventoryEntityList);
    }

    @Override
    public void updateItemInfo(List<ItemInfo> itemInfos) {
        List<ItemEntity> itemEntityList =
                modelmapper.map(itemInfos, new TypeToken<List<ItemEntity>>() {}.getType());
        inventoryTransactionHelper.SaveAllItemInfo(itemEntityList);
    }

}

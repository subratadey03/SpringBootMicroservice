/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:24:59 PM
 *
 */
package com.sub.inventoryManagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.sub.inventoryManagement.domain.entity.InventoryEntity;
import com.sub.inventoryManagement.domain.entity.ItemEntity;
import com.sub.inventoryManagement.domain.repository.InventoryRepository;
import com.sub.inventoryManagement.domain.repository.ItemRepository;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Subrata Dey
 *         InventoryTransactionHelper.java
 */
@Component
@Slf4j
public class InventoryTransactionHelper {

    @Autowired
    private InventoryRepository inventoryRepository;

    @Autowired
    private ItemRepository itemRepository;


    public void SaveAllInventory(List<InventoryEntity> inventoryEntityList) {
        inventoryRepository.saveAll(inventoryEntityList);
    }


    public void SaveAllItemInfo(List<ItemEntity> itemEntityList) {
        itemRepository.saveAll(itemEntityList);
    }



}

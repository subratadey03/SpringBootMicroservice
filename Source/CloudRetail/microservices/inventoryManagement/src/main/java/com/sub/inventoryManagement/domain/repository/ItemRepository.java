/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:18:15 PM
 *
 */
package com.sub.inventoryManagement.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.inventoryManagement.domain.entity.ItemEntity;

/**
 * @author Subrata Dey
 * ItemRepository.java
 */
public interface ItemRepository  extends JpaRepository<ItemEntity, Integer>{

}

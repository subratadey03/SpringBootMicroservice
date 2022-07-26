/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:20:52 PM
 *
 */
package com.sub.inventoryManagement.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sub.inventoryManagement.domain.entity.InventroyEntity;
/**
 * @author Subrata Dey
 * InventoryRepository.java
 */
public interface InventoryRepository  extends JpaRepository<InventroyEntity, Integer>{

}

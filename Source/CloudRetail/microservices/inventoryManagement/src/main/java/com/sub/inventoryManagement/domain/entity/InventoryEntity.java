/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:15:07 PM
 *
 */
package com.sub.inventoryManagement.domain.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @author Subrata Dey
 * InventroyEntity.java
 */

@Entity
@Table(name = "M_INVENTORY_INFO")
@Data
public class InventoryEntity implements Serializable{
    
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ITEM_ID", nullable = false, length = 10)
    private Integer itemId;
    
    @Column(name = "TOTAL_AVILABLE_QUANTITY", nullable = false)
    private int totalAvilableQuantity;

}

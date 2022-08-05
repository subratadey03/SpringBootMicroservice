/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:03:14 PM
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
 *         ItemEntity.java
 */

@Entity
@Table(name = "M_ITEM_INFO")
@Data
public class ItemEntity implements Serializable {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ITEM_ID", nullable = false, length = 10)
    private Integer itemId;

    @Column(name = "ITEM_NAME", nullable = false, length = 20)
    private String itemName;

    @Column(name = "ITEM_DESCRIPTION", nullable = false, length = 20)
    private String itemDscription;

    @Column(name = "ITEM_CATEGORY", nullable = false, length = 20)
    private String itemCategory;

    @Column(name = "ITEM_SUBCATEGORY_1", nullable = false, length = 20)
    private String itemSubCategory_1;

    @Column(name = "ITEM_SUBCATEGORY_2", nullable = false, length = 20)
    private String itemSubCategory_2;

    @Column(name = "ITEM_SUBCATEGORY_3", nullable = false, length = 20)
    private String itemSubCategory_3;

    @Column(name = "ITEM_MESUREMENT_UNIT", nullable = false)
    private String itemMesurementUnit;

    @Column(name = "ITEM_PER_UNIT_PRICE", nullable = false)
    private int itemPerUnitPrice;


}

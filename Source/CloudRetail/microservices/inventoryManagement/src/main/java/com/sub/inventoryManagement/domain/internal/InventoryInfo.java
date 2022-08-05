/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:47:43 PM
 *
 */
package com.sub.inventoryManagement.domain.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Subrata Dey
 * InventoryInfo.java
 */

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryInfo {
    
    @ApiModelProperty(required = true, value = "itemId", notes = "Item Id")
    @JsonProperty("itemId")
    private Integer itemId;
    
    @ApiModelProperty(required = true, value = "totalAvilableQuantity", notes = "Total Avilable Quantity")
    @JsonProperty("totalAvilableQuantity")
    private int totalAvilableQuantity;

}

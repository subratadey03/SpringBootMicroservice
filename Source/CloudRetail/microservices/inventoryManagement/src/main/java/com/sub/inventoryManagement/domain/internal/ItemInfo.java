/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:47:27 PM
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
 * ItemInfo.java
 */

@ApiModel
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemInfo {

    @ApiModelProperty(required = true, value = "itemId", notes = "Item Id")
    @JsonProperty("itemId")
    private Integer itemId;
    
    @ApiModelProperty(required = true, value = "itemName", notes = "Item Name")
    @JsonProperty("itemName")
    private String itemName;
    
    @ApiModelProperty(required = true, value = "itemDscription", notes = "Item Dscription")
    @JsonProperty("itemDscription")
    private String itemDscription;
    
    @ApiModelProperty(required = true, value = "itemCategory", notes = "Item Category")
    @JsonProperty("itemCategory")
    private String itemCategory;
    
    @ApiModelProperty(required = true, value = "itemSubCategory_1", notes = "Item SubCategory_1")
    @JsonProperty("itemSubCategory_1")
    private String itemSubCategory_1;
    

    @ApiModelProperty(required = true, value = "itemSubCategory_2", notes = "Item SubCategory_2")
    @JsonProperty("itemSubCategory_2")
    private String itemSubCategory_2;

    @ApiModelProperty(required = true, value = "itemSubCategory_3", notes = "Item SubCategory_3")
    @JsonProperty("itemSubCategory_3")
    private String itemSubCategory_3;
    
    @ApiModelProperty(required = true, value = "itemMesurementUnit", notes = "Item Mesurement Unit")
    @JsonProperty("itemMesurementUnit")
    private String itemMesurementUnit;
    
    @ApiModelProperty(required = true, value = "itemPerUnitPrice", notes = "Item Per Unit Price")
    @JsonProperty("itemPerUnitPrice")
    private int itemPerUnitPrice;

}

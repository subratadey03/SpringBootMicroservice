/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 27, 2022 7:39:18 AM
 *
 */
package com.sub.inventoryManagement.domain.external.request;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sub.inventoryManagement.domain.internal.ItemInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Subrata Dey
 * UpdateItemInfoRequest.java
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateItemInfoRequest extends InventoryManagementRequest {

    @ApiModelProperty(required = true, value = "itemInfos",
            notes = "Item Information to add/update")
    @JsonProperty("items")
    @NotEmpty()
    @Size(max = 1)
    @Valid
    private List<ItemInfo> itemInfos;

}

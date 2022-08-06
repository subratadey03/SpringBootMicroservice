/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 27, 2022 9:27:56 AM
 *
 */
package com.sub.inventoryManagement.domain.external.request;

import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sub.inventoryManagement.domain.internal.InventoryInfo;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Subrata Dey
 * UpdateItemInventroyRequest.java
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateItemInventroyRequest extends InventoryManagementRequest {
    
    @ApiModelProperty(required = true, value = "itemInventoryInfos",
            notes = "Item quantity Information to add/update")
    @JsonProperty("itemInventoryInfos")
    @NotEmpty()
    @Size(max = 1)
    @Valid
    private List<InventoryInfo> itemInventoryInfos;

}

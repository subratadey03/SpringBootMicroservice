/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:22:43 PM
 *
 */
package com.sub.inventoryManagement.web;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.sub.inventoryManagement.domain.external.request.UpdateItemInventroyRequest;
import com.sub.inventoryManagement.domain.external.response.ItemInfoResponse;
import com.sub.inventoryManagement.domain.external.response.ItemInventroyResponse;
import com.sub.inventoryManagement.constent.InventoryManagementAPI;
import com.sub.inventoryManagement.constent.InventoryManagementConstent;
import com.sub.inventoryManagement.constent.InventoryManagementSuccess;
import com.sub.inventoryManagement.domain.external.request.UpdateItemInfoRequest;
import com.sub.inventoryManagement.service.InventoryService;
import com.sub.microserviceCommon.domain.response.CloudRetailResponse;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Subrata Dey
 *         InventoryController.java
 */

@Slf4j
@RestController
@Validated
@RequestMapping(value = "/inventory-management/")
public class InventoryController {

    @Autowired
    public InventoryService inventoryService;

    @PostMapping(value = InventoryManagementConstent.UPDATE_INVENTORY_API_URI,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CloudRetailResponse> updateInventory(
            @Valid @RequestBody UpdateItemInventroyRequest updateItemInventroyRequest) {

        inventoryService.updateInventory(updateItemInventroyRequest.getItemInventoryInfos());

        ItemInventroyResponse response =
                new ItemInventroyResponse(InventoryManagementAPI.POST_INVENTORY);
        response.getResult().setCode(InventoryManagementSuccess.INVETORY_UPDATE_SUCCESS.getCode());
        return new ResponseEntity<CloudRetailResponse>(response, HttpStatus.OK);
    }


    @PostMapping(value = InventoryManagementConstent.UPDATE_ITEM_INFO_API_URI,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CloudRetailResponse> updateItemInfo(
            @Valid @RequestBody UpdateItemInfoRequest updateItemInfoRequest) {

        inventoryService.updateItemInfo(updateItemInfoRequest.getItemInfos());

        ItemInfoResponse response = new ItemInfoResponse(InventoryManagementAPI.POST_ITEMINFO);
        response.getResult().setCode(InventoryManagementSuccess.ITEM_INFO_UPDATE_SUCCESS.getCode());
        return new ResponseEntity<CloudRetailResponse>(response, HttpStatus.OK);
    }

}

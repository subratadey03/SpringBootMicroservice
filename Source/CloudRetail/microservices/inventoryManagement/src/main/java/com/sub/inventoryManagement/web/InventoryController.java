/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 4:22:43 PM
 *
 */
package com.sub.inventoryManagement.web;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Subrata Dey
 * InventoryController.java
 */

@Slf4j
@RestController
@Validated
@RequestMapping(value = "${request.url.prefix}")
public class InventoryController {

}

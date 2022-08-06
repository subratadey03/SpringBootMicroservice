/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 8:41:16 AM
 *
 */
package com.sub.inventoryManagement.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Subrata Dey
 * InventoryManagementConfiguration.java
 */
@Configuration
public class InventoryManagementConfiguration {
    
    /**
     * ModelMapper for mapping objects
     *
     * @return ModelMapper
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}

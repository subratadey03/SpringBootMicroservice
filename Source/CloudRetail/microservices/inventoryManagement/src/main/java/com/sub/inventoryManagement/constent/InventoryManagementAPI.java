/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 11:33:17 AM
 *
 */
package com.sub.inventoryManagement.constent;

import org.springframework.http.HttpMethod;
import com.sub.microserviceCommon.constent.CloudRetailAPI;

/**
 * @author Subrata Dey
 *         InventoryManagementAPI.java
 */
public enum InventoryManagementAPI implements CloudRetailAPI {

    POST_INVENTORY(InventoryManagementConstent.UPDATE_INVENTORY_API_NO, InventoryManagementConstent.UPDATE_INVENTORY_API_URI,
            HttpMethod.POST),
    POST_ITEMINFO(InventoryManagementConstent.UPDATE_ITEM_INFO_API_NO, InventoryManagementConstent.UPDATE_ITEM_INFO_API_URI,
            HttpMethod.POST);

    private String uri;
    private int apiNo;
    private HttpMethod httpMethod;
    
    /**
     * Creates an enum object based on the parameters provided.
     *
     * @param apiNo, api No for the application.
     * @param uri, the api rest end point uri.
     * @param httpMethod, the REST end point httpMethod
     */

    InventoryManagementAPI(final int apiNo, final String uri, final HttpMethod httpMethod) {
        this.apiNo = apiNo;
        this.uri = uri;
        this.httpMethod = httpMethod;
    }

    @Override
    public int getApiNo() {
        return apiNo;
    }

    @Override
    public HttpMethod getHTTPMethod() {
        return httpMethod;
    }

    @Override
    public String getURI() {
        return uri;
    }
}

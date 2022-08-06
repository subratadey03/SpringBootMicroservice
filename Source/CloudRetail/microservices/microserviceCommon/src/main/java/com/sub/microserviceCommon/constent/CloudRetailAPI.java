/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 11:34:19 AM
 *
 */
package com.sub.microserviceCommon.constent;

import org.springframework.http.HttpMethod;

/**
 * @author Subrata Dey
 * CloudRetailAPI.java
 */
public interface CloudRetailAPI {
    /**
     * Returns the apiNo for this enum object.
     *
     * @return int, the api No.
     */
    int getApiNo();

    /**
     * Return the HTTP method of this api enum object.
     *
     * @return HttpMethod, for this api enum object.
     */
    HttpMethod getHTTPMethod();

    /**
     * The api end point URI for this enum object
     *
     * @return String, the uri end point.
     */
    String getURI();
}

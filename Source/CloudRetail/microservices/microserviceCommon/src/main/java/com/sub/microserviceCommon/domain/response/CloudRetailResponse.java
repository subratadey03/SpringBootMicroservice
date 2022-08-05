/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 6:32:10 PM
 *
 */
package com.sub.microserviceCommon.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Subrata Dey
 * CloudRetailResponse.java
 */

/**
 * Abstract class for all the CloudRetail Microservice Response classes. All the CloudRetail
 * micro services should rest api's should return an object of type CloudRetailResponse.
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class CloudRetailResponse {
    
    /** serialVersionUID */
    private static final long serialVersionUID = 1L;

    @JsonProperty("result")
    private Result result;

}

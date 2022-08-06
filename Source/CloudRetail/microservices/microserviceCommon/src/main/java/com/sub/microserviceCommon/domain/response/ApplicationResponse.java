/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Aug 5, 2022 7:58:53 AM
 *
 */
package com.sub.microserviceCommon.domain.response;

/**
 * @author Subrata Dey
 * ApplicationError.java
 */
public interface ApplicationResponse {
    
    public Integer getCode();

    public String getCaption(); 

}

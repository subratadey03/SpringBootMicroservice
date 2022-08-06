/**
 * Copyright(C) 2022 @ Subrata Dey
 * Data of Creation : Jul 26, 2022 6:15:17 PM
 *
 */
package com.sub.microserviceCommon.domain.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Subrata Dey
 * Result.java
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {
    
    @Builder.Default
    @JsonProperty("ms")
    private int ms = 1;

    @Builder.Default
    @JsonProperty("api")
    private int api = 1;
    
    @Builder.Default
    @JsonProperty("code")
    private int code = 0;
}

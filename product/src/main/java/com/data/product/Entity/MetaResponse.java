package com.data.product.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MetaResponse {
    private String msg;
    private int statusCode;
    private boolean error;

    public MetaResponse(String msg, int statusCode, boolean error) {
        this.msg = msg;
        this.statusCode = statusCode;
        this.error = error;
    }
}
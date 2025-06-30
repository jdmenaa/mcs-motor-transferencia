package com.service.userstore.mcs_motor_transferencia.common;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Response<T> {

    /**
     * Data to response
     */
    private T data;

    /**
     * Message to response
     */
    private String message;

    /**
     * Code to response
     */
    private Integer code;
}

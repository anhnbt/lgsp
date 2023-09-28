package com.anhnbt.lgsp.response;

public class ApiResponse {
    private Object data;

    public ApiResponse(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

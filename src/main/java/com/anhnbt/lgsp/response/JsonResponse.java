package com.anhnbt.lgsp.response;

public class JsonResponse {

    private String message;

    public JsonResponse() {
    }

    public JsonResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

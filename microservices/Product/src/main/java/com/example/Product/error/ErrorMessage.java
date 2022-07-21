package com.example.Product.error;

import org.apache.http.HttpStatus;

public class ErrorMessage {

    public ErrorMessage() {
        super();
        // TODO Auto-generated constructor stub
    }
    public ErrorMessage(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }
    private HttpStatus status;
    private String message;
    public HttpStatus getStatus() {
        return status;
    }
    public void setStatus(HttpStatus status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}